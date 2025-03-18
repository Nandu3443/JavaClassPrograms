class MsWord extends Thread{
	public void typing() {
		for(int i=0;i<30;i++) {
			System.out.println("Typing..");
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void autoCorrection() {
		for(;;) {
			System.out.println("autocorrection");
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void spellChecking() {
		for(;;) {
			System.out.println("spellChecking");
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		String name = this.getName();
		if (name.equals("typing")) {
			typing();
		}else if (name.equals("autoCorrection")) {
			autoCorrection();
		}else if (name.equals("spellChecking")) {
			spellChecking();
		}
	}
}
public class MsWordProg {

	public static void main(String[] args) {
		MsWord t1 = new MsWord();
		MsWord t2 = new MsWord();
		MsWord t3 = new MsWord();
		t1.setName("typing");
		t2.setName("autoCorrection");
		t3.setName("spellChecking");
//		t2.setDaemon(true);
//		t3.setDaemon(true);
//		t2.setPriority(1);
//		t3.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
	}

}
