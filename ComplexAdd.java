import java.io.*; 
class Complex 
{ int r,i; 
public void add(Complex c1,Complex c2) throws IOException 
{ 
InputStreamReader is = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(is); int real,imag; 
 
System.out.print("Enter real part of first complex number: "); c1.r = Integer.parseInt(br.readLine()); 
System.out.print("Enter imaginary part of first complex number: "); c1.i = Integer.parseInt(br.readLine()); 
System.out.print("Enter real part of second complex number: "); 
c2.r = Integer.parseInt(br.readLine()); 
System.out.print("Enter imaginary part of second complex number: "); c2.i = Integer.parseInt(br.readLine()); 
 
real = c1.r+c2.r; imag = c1.i+c2.i; 
System.out.println(); 
System.out.println("The complex number after addition is = "+real+" + "+imag+"i"); 
}} 
 
class ComplexAdd 
{ 
public static void main(String[] args) throws IOException 
{ 
Complex c1=new Complex(); 
Complex c2=new Complex(); 
Complex c3=new Complex(); 
 
c3.add(c1,c2); 
}} 
 
