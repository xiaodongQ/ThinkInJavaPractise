package chp5;

public class EnumMoney {
	public static void main(String[] args) {
		for(Money m : Money.values()) {
			System.out.println(m + ", ordinal:" + m.ordinal());
		}
		Money mon = Money.JIAO;
		switch(mon) {
		case FEN: System.out.println("have money: 1 FEN"); 
				  break;
		case JIAO: System.out.println("have money: 1 JIAO");
				  break;
		case YUAN: System.out.println("have money: 1 YUAN");
				  break;
		}
	}
		
}

enum Money {
	FEN, JIAO, YUAN
}