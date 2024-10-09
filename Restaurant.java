package Restaurant;

import java.util.*;
class Restaurant
{
    static String usrename;
    static String pass;
    static String phone;
    static ArrayList<String> cart = new ArrayList<>();
    static double bill;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for( ; ; )
        {
            System.out.println();
            System.out.println("        ******WELECOME TO MY RESTAURANT******         ");
            System.out.println();
            System.out.println("1 .Sign In");
            System.out.println("2 .Sign Up");
            System.out.println();
            System.out.println("ENTER An Option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    login(sc);
                    break;    
            
                default: 
                    System.out.println("Wrong Option Enterd");
                    break;
            }

        }
        
    }


    public static void createAccount(Scanner sc) 
    {
        System.out.println();
        System.out.println(" Create An Account ");
        System.out.println();
        System.out.println("Usrename :");
        sc.nextLine();
        usrename = sc.nextLine();
        System.out.println(" Password :");
        pass =sc.next();
        System.out.println("Contact no :");
        phone =sc.next();
        System.out.println("An Account Created ");
        System.out.println();

        
    }


    public static void login(Scanner sc)
    {
        if(usrename!=null)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println();
                System.out.println(" Login Page");
                System.out.println();
                System.out.println("Usrename/conc :");
                sc.nextLine();
                String un1 = sc.nextLine();
                System.out.println(" Password :");
                String pass1 =sc.next();


                if (((un1.equals(usrename)) || (un1.equals(phone))) && (pass1.equals(pass))) 
                {
                    homepage(sc);
                    
                }
                else{
                    System.out.println();
                    System.out.println("        ******  Congratulations !!!  *******     \n You Enterd Wrong Usrename And Password");
                }

            }
            System.exit(0);
        }
       else{
        System.out.println("Create Your Account First  :");
       } 
    }


    public static void homepage(Scanner sc)
    {
        for( ; ; )
        {
            System.out.println();
            System.out.println("        ******WELECOME TO HOME PAGE OF MY RESTAURANT******         ");
            System.out.println();
            System.out.println("1 .Veg");
            System.out.println("2 .Non-Veg");
            System.out.println("3 .Checkout");
            System.out.println("4 .Logout");
            System.out.println();
            System.out.println("ENTER An Option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    vegMenu(sc);
                    break;
                case 2:
                    nonVegMenu(sc);
                    break;   
                case 3:
                    CheckOut(sc);
                    break;  
                case 4:
                     System.exit(0);   
                     System.out.println("Thank You");
                     break; 

                default: 
                    System.out.println(" **************************************Wrong Option Enterd *****************************************");
                    break;
            }

        }

        
    }

    public static void vegMenu(Scanner sc) 
    {
        for( ; ; )
        {
            System.out.println();
            System.out.println("****************Veg Dishes**********************");
            System.out.println("1.PannerTikka : 300");
            System.out.println("2.VegBiryani : 350");
            System.out.println("3.VegMaratha : 200");
            System.out.println("4.Rice : 140");
            System.out.println("5. Menu");
            System.out.println();
            System.out.println("Enter dish id :");
            int id =sc.nextInt();

            switch (id) {
                case 1: cart.add("pannerTikka : 300");
                        System.out.println("PannerTikka added inside the cart");
                        bill += 300;
                    
                    break;
                case 2: cart.add("VegBiryani : 350");
                        System.out.println("VegBiryani added inside the cart");
                        bill += 350;
                    
                    break;
                case 3: cart.add("VegMaratha : 200");
                    System.out.println("VegMaratha added inside the cart");
                    bill += 200;
                break;
            case 4: cart.add("rice : 140");
                System.out.println("rice added inside the cart");
                bill += 140;
            
            break;
            case 5: return;

            default:System.out.println("***************************wrong dish id*********************************");
                    break;
            }


        }
        
    }


    public static void nonVegMenu(Scanner sc) 
    {
        for( ; ; )
        {
            System.out.println();
            System.out.println("****************Non Veg Dishes**********************");
            System.out.println("1.chikenTikka : 300");
            System.out.println("2.chikenCurry: 300");
            System.out.println("3.chikenBiryani : 300");
            System.out.println("4.chiken65 : 300");
            System.out.println("5. Menu");
            System.out.println();
            System.out.println("Enter dish id :");
            int id =sc.nextInt();

            switch (id) {
                case 1: cart.add("ChikenTikka : 300");
                        System.out.println("ChikenTikka added inside the cart");
                        bill += 300;
                    
                    break;
                case 2: cart.add("chikenCurry : 400");
                        System.out.println("chikenCurry added inside the cart");
                        bill += 400;
                    
                    break;
                case 3: cart.add("chikenBiryani : 450");
                    System.out.println("chikenBiryani added inside the cart");
                    bill += 450;
                
                break;
            case 4: cart.add("chiken65 : 420");
                System.out.println("chiken65 added inside the cart");
                bill += 420;
            
            break;
            case 5: return;

            default:System.out.println("****************************wrong dish id************************************");
                    break;
            }


        }
        
    }

    public static void cart(Scanner sc)
    {
        System.out.println("***************************Your Purchased Food*********************************");
        System.out.println();
        for( String food : cart)
        {
            System.out.println(food);
        }
        System.out.println();
        System.out.println("*********************Your Total bill is " + bill + " rs********************************");
        System.out.println();
    }


    public static void CheckOut(Scanner sc)
    {
        System.out.println("**********************Checkout****************************");
        cart(sc);
    }

}