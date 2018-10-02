import java.util.Scanner;
class Payment{  double total=0;
	public  double pay(double sum)
	{
	total=sum;
	double discount=0;
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Amount to be paid="+sum);
	System.out.println("Paymet by :");
	do{System.out.println("1.cash  \n2.credit card\n3.debit card");
	ch=sc.nextInt();
	switch(ch){
		case 1:discount=0;
		System.out.println("Enter cash received : ");
		int a=sc.nextInt();
		System.out.println("Change returned"+(a-sum));
		break;
		case 2:int ch2;
		       do{System.out.println("Bank name :\n1.SBI\n2.ICICI Bank\n3.Others");
			   ch2=sc.nextInt();
			   switch(ch2){
				   case 1:discount=sum*15/100;
				   System.out.println("Discount="+discount);
				   total=sum-discount;
					System.out.println("Total amount paid ="+total);
					System.out.println("Transaction Successfull");
				   break;
				   case 2:discount=sum*10/100;
				   System.out.println("Discount="+discount);
				total=sum-discount;
				   System.out.println("Total amount paid ="+total);
					System.out.println("Transaction Successfull");
				   break;
				   case 3:discount=sum*5/100;
				   System.out.println("Discount="+discount);
				   total=sum-discount;
					System.out.println("Total amount paid ="+total);
					System.out.println("Transaction Successfull");
					break;
				   default:System.out.println("Invalid entry");
			   } 
			   }while(ch2!=3&&ch2!=2&&ch2!=1);
			   break;
		case 3:discount=sum*5/100;
		System.out.println("Discount="+discount);
		total=sum-discount;
		System.out.println("Total amount paid ="+total);
		System.out.println("Transaction Successfull");
		break;
		default:System.out.println("Invalid entry");
	}
    }while(ch!=3&&ch!=2&&ch!=1);
	return(total);

}}
