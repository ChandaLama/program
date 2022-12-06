public class Demodatatype{
	public static void main(String[] args){
		//long l =500l;
		//long l=new long(500);
		//int i =l.intValue();
		//long ll=i;
		//byte b=l.byteValue();
		//System.out.println(ll);
			//long l=500;
//Integer i=Integer.parseInt(l.toString());

		 //String s="500 ";
    //Double d=Double.parseDouble(s);
		//Integer i=Integer.parseInt(s);
		
		try{
		    String s= "500L";
		    Integer i=Integer.parseInt(s);
		    System.out.println(i);
		}
		catch(NumberFormatException e){
			//System.out.println(e.getmessage());
			e.printStackTrace();
		}
		
		System.out.println("Good job.");
		
		
	}
}