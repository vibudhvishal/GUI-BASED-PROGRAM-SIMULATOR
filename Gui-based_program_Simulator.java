import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class qq extends Frame{
	public qq(){

	//MAIN FRAME 
	JFrame fc=new JFrame("JAVA PROJECT");
	Panel p= new Panel();
	p.setBounds(1080,1920,400,400);
	fc.add(p);
	fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fc.setLayout (new CardLayout());  
	fc.setVisible(true);
	p.setBackground(Color.yellow);
	JButton btn1=new JButton("ADDITON PROGRAM");
	JButton btn2=new JButton("MERGE-SORT");
	JButton btn3=new JButton("STUDENT PROGRAM");
	JButton btn4=new JButton("QUICK-SORT");
	JButton btn5=new JButton("STACK PROGRAM");
	p.add(btn1);
	p.add(btn2);
	p.add(btn3);
	p.add(btn4);
	p.add(btn5); 
    fc.setSize(300,400);



	
	//SUB-FRAME FOR ALL PROGRAMS
	//PROGRAM-1

	JFrame f1=new JFrame("STUDENT RECORD");
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setLayout(new FlowLayout());
	f1.setSize(1000,1600);
	f1.setLayout(new FlowLayout());
btn1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
		f1.setVisible(true);
		fc.setVisible(false);
		f1 f=new f1(f1);
}});



	//PROGRAM-2
	JFrame f2=new JFrame("MERGE-SORT");
	f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f2.setLayout(new GridLayout());
	f2.setSize(1000,1600);
	f2.setLayout(new FlowLayout());
	btn2.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		f2.setVisible(true);
    		fc.setLayout (new FlowLayout()); 
    		f2 f=new f2(f2);
}});	
	//PROGRAM-3
	JFrame f3=new JFrame("STUDENT RECORD");
	f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f3.setLayout(new FlowLayout());
	f3.setSize(1000,1600);
	f3.setLayout(new FlowLayout());

	btn3.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
        	f3.setVisible(true);
        	f3 f=new f3(f3);
}});

	//PROGRAM-4
	
	JFrame f4=new JFrame("QUICK-SORT");
	f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f4.setLayout(new FlowLayout());
	f4.setSize(1000,1600);
	f4.setLayout(new FlowLayout());
	btn4.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){	
        	f4.setVisible(true);
        	f4 f=new f4(f4);
}});
	

	//PROGRAM-5

	JFrame f5=new JFrame("STACK OPERATION");
	f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f5.setLayout(new GridLayout());
	f5.setSize(1000,1600);
	f5.setLayout(new FlowLayout());
btn5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        f5.setVisible(true);
        f5 f=new f5(f5);
}});
}


public static void main(String[] args) {
	new qq();	
	}
}


 class f1{
 	JTextField t1,t2,t3;
 	JButton sum;
 	JLabel res;
	f1(Frame f){
		sum=new JButton("sum");
		f.add(sum);
		res = new JLabel("   "); 
		res.setBounds(100, 350, 350, 20);
    	t1=new JTextField("NAME");  
    	t1.setBounds(50,50,150,20);  
    	t2=new JTextField("USN");  
    	t2.setBounds(50,100,150,20);  
   		f.add(t1);
   		f.add(t2); 
   		f.add(res);
		sum.addActionListener(new sumActionListener());	
		//t3=new JTextField("------");
		t3.setBounds(50,150,200,30);
		//f.add(t3);
	}
 class sumActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
				System.out.println("kkkkkkk");
	
   				String s1=t1.getText();
				String s2=t2.getText();
				int c=0;
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(s2);
				c=a+b;
				System.out.println(c);
				String result=String.valueOf(c);
				res.setText(result);

		}
	}		
}


//CLASS  AND ALGORITHM FOR MERGE SORT ALGORITHM
class f2{
	JTextField t1, t2, t3, t4, t5,b;
	JLabel l1, l2, l3, l4, l5;
	JButton button;
	JTextArea result;
	f2(Frame f){
		Panel p=new Panel();
		Panel p1=new Panel();
		p.setBounds(10,40,300,300);
		p1.setBounds(50,90,5000,1000);
		p1.setBackground(Color.blue);
		p.setBackground(Color.green);
		l1 = new JLabel("1st number");
		t1 = new JTextField("---");
		l2 = new JLabel("2nd number");
		l3 = new JLabel("3rd number");
		l4 = new JLabel("4th number");
		l5 = new JLabel("5th number");
		result = new JTextArea("");
		f.add(p);
		f.add(p1);
		t2 = new JTextField("------");
		t3 = new JTextField("------");
		t4 = new JTextField("------");
		t5 = new JTextField("------");
		
		button = new JButton("sort");
		b=new JTextField("TIME COMPLEXITY OF MERGE-SORT: nlogn");
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		result.setBounds(100, 350, 350, 20);
		t1.setBounds(200, 50, 100,20);
		t2.setBounds(200, 100, 100, 20);
		t3.setBounds(200, 150, 100, 20);
		t4.setBounds(200, 200, 100, 20);
		t5.setBounds(200, 250, 100, 20);
		button.setBounds(125, 300, 50, 30);
		button.addActionListener(new mergesort());
		p1.add(b);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(l4);
		p.add(t4);
		p.add(l5);
		p.add(t5);
		p.add(result);
		p.add(button);
	}

	class mergesort implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a[]=new int[100];
			a[0]=Integer.parseInt(t1.getText());
			a[1]=Integer.parseInt(t2.getText());
			a[2]=Integer.parseInt(t3.getText());
			a[3]=Integer.parseInt(t4.getText());
			a[4]=Integer.parseInt(t5.getText());
			mergesort(a, 5);

			b.setText(" ");
			result.setText(a[0] +"  "+a[1]+"  "+a[2]+"  "+a[3]+"  "+a[4]);

		}

public void mergesort(int a[],int y){
        int b[]=new int[200];
        int c[]=new int [200];
        int k,w=0;
	System.out.println("tttt");
        if(y>1)
        {
                for(int i=0;i<(y/2);i++)
                {
                        b[i]=a[i];
                }
        mergesort(b,y/2);
        k=y-(y/2);
        for(int i=(y/2);i<y;i++,w++)
        c[w]=a[i];

        mergesort(c,k);
        merge(a,b,c,y);
        }
}
public void merge(int a[],int b[],int c[],int y)
        {
        int i=0,j=0,k=0;
        int z=y-(y/2);
        while(i<(y/2)&&j<z)
        {
                if (b[i]<c[j])
                {
                        a[k]=b[j];
                        i++;
                }
                else{
                        a[k]=c[j];
                         j++;
                    }
                k++;
        }
        while (i<(y/2))
        {
                a[k]=b[i];
                i++;
                k++;
        }
        while(j<z)
        {
                a[k]=c[j];
                j++;
                k++;
        	}
        }
																						
	}
}


class f3{
		String y;
		JTextField t1,t2,t3,t4,n1;
		JTextArea l1,l2,l3,l4,l5;
		JButton print,n;
	f3(Frame f){
		f.setLayout(new BorderLayout());
		f.setVisible(true);
		f.setSize(600,500);
		Panel p= new Panel();
		Panel p1=new Panel();
		p1.setBounds(10,30,1080,2000);
		p.setBounds(60,100,500,200);
		p.setBackground(Color.blue);
		p1.setBackground(Color.green);
		t1=new JTextField("NAME:",14);
		t2=new JTextField("USN: ",14);
		t3=new JTextField("SEM: ",14);
		t4=new JTextField("BRANCH: ",14);
		print=new JButton("PRINT");
		n=new JButton("--N--");
		
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(print);
		f.add(p);
		f.add(p1);
		n1 = new JTextField("INPUT NUMBER OF INPUTS");
		l1 = new JTextArea("First Number");
		l2 = new JTextArea("Second Number");
		l3 = new JTextArea("SEMESTER: ");
		l4 = new JTextArea("BRANCH:  ");
		l5 = new JTextArea("");
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		//p1.add(n);
		print.addActionListener(new Student());
		y=n1.getText();
		System.out.println(y);
	
}	
	class Student implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String a[]=new String[100];
			
			a[0]=t1.getText();
			a[1]=t2.getText();
			a[2]=t3.getText();
			a[3]=t4.getText();
			l1.append(a[0] +"\n");
			l2.append(a[1]+"\n");
			l3.append(a[2]+"\n");
			l4.append(a[3]+"\n");
			l5.setText("\n");

		

		}
	}
}

//CLASS AND ALGORITHM FOR QUICK SORT

class f4{
	JTextField t1, t2, t3, t4, t5,b;
	JLabel l1, l2, l3, l4, l5;
	JButton button;
	JTextArea result;

	f4(Frame f){
		Panel p=new Panel();
		Panel p1=new Panel();
		p.setBounds(10,40,300,300);
		p1.setBounds(00,90,5000,1000);
		p1.setBackground(Color.blue);
		p.setBackground(Color.green);
		l1 = new JLabel("1st number");
		t1 = new JTextField("---");
		l2 = new JLabel("2nd number");
		l3 = new JLabel("3rd number");
		l4 = new JLabel("4th number");
		l5 = new JLabel("5th number");
		result = new JTextArea("");
		f.add(p);
		f.add(p1);
		t2 = new JTextField("------");
		t3 = new JTextField("------");
		t4 = new JTextField("------");
		t5 = new JTextField("------");
		
		button = new JButton("sort");
		b=new JTextField("TIME COMPLEXITY OF MERGE-SORT: nlogn");
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		result.setBounds(100, 350, 350, 20);
		t1.setBounds(200, 50, 100,20);
		t2.setBounds(200, 100, 100, 20);
		t3.setBounds(200, 150, 100, 20);
		t4.setBounds(200, 200, 100, 20);
		t5.setBounds(200, 250, 100, 20);
		button.setBounds(125, 300, 50, 30);
		button.addActionListener(new quicksort());
		p1.add(b);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(l4);
		p.add(t4);
		p.add(l5);
		p.add(t5);
		p.add(result);
		p.add(button);
	}


	class quicksort implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a[]=new int[100];
			a[0]=Integer.parseInt(t1.getText());
			a[1]=Integer.parseInt(t2.getText());
			a[2]=Integer.parseInt(t3.getText());
			a[3]=Integer.parseInt(t4.getText());
			a[4]=Integer.parseInt(t5.getText());
			quicksort(a,0,5);

			b.setText(" ");
			result.setText(a[0] +"  "+a[1]+"  "+a[2]+"  "+a[3]+"  "+a[4]);

		}
		 public void quicksort(int[]A,int f,int r){
                if(f<r){
                	int s;
                	System.out.println("aa gaya aaa");
                    s=partition(A,f,r);
                    System.out.println("iiiiiiiiiiiii");
                    quicksort(A,f,(s-1));
                    quicksort(A,(s+1),r);
                }
        }
        public int partition(int[]A,int f,int r){
                int pivot=A[r];
                int i=(f-1);
                for(int j=f;j<=r-1;j++){
                        if(A[i]<=pivot)
                        {
                                i++;
                                int temp=A[i];
                                A[i]=A[j];
                                A[j]=temp;
                        }
                }
                int temp=A[r];
                A[r]=A[i+1];
                A[i+1]=temp;
                return (i+1);
        }

	}

}

class f5{
		JTextField t1;
		JTextArea result=new JTextArea("");
		String stack[]=new String[100];
		int top=-1,max=100;
	f5(Frame f){
		JButton btnPush=new JButton("PUSH");
		JButton btnPop=new JButton("POP");
		JButton btnDis=new JButton("DISPLAY");
		t1 = new JTextField("----------------");
		t1.setBounds(40,60,300,200);
		f.add(t1);
		f.add(btnPush);
		f.add(btnPop);
		f.add(btnDis);
		f.add(result);
		
	btnPush.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            push();

        }

        private void push() {

           String s=t1.getText();
           if(top==max){
           	System.exit(0);
           }
           else{
           	stack[++top]=s;
           	System.out.println(stack[top]);
           }

        }
    });

	btnPop.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			pop();
		}
		private void pop(){
			if(top==-1){
				System.exit(1);
			}
			else{
				top--;
				System.out.println(stack[0]+"   " +stack[1]);
			}
		}
	});


	btnDis.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			display();
		}
		private void display(){
			if(top==-1){
				System.exit(1);
			}
			else{  
				for(int i=0;i<=top;i++){
					result.append(stack[i]+"\t");
					System.out.println(stack[i]);
				}
			}
		}
	});
}}
