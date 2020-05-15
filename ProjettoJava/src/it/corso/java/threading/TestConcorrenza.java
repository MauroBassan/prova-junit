package it.corso.java.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import it.corso.java.threading.concorrenza.GetSitePage;
import it.corso.java.threading.concorrenza.GetSitePageExecutor;
import it.corso.java.threading.concorrenza.GetSitePageForkJoin;

public class TestConcorrenza {

	public static void main(String[] args) {
		TestConcorrenza tc = new TestConcorrenza();
		try {
			tc.esempioConcorrenzaThread();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		try {
			tc.esempioConcorrenzaExecutor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tc.esempioConcorrenzaForkJoin();
		
	}
	
	private void esempioConcorrenzaForkJoin() {
		ForkJoinPool f = new ForkJoinPool();
		
		System.out.println(f.invoke(new GetSitePageForkJoin("http://www.qclubmilano.com")));
		System.out.println(f.invoke(new GetSitePageForkJoin("http://www.google.it")));
		
		f.shutdown();
	}

	private void esempioConcorrenzaExecutor() throws InterruptedException, ExecutionException {
		// creiamo una lista di Callable String
		List<Callable<String>> siti = new ArrayList<Callable<String>>();
		
		siti.add(new GetSitePageExecutor("http://www.qclubmilano.com"));
		siti.add(new GetSitePageExecutor("http://www.google.it"));
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		List<Future<String>> out = ex.invokeAll(siti);
		
		for (Future<String> future : out) {
			System.out.println("----------------");
			System.out.println(future.get());
		}
		ex.shutdown();
	}
	
	
	private void esempioConcorrenzaThread() throws InterruptedException {
		
		GetSitePage s1 = new GetSitePage("http://www.qclubmilano.com");
		GetSitePage s2 = new GetSitePage("http://www.google.it");
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
		System.out.println("OUTPUT Q CLUB");
		System.out.println(s1.getContent());
		
		System.out.println("OUTUT GOOGLE");
		System.out.println(s2.getContent());
	}
}
