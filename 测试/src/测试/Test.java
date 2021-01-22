package 测试;

public class Test {

	public static void main(String[] args) {
	
		Account a1=new Account("19990704",14576.6);
		
		System.out.println("用户"+a1.getActno()+"的余额为"+a1.getBalance());
	}

}
