package Project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WelcomeScreen {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/jayashreemore/Desktop/");
        file.mkdirs();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("******Welcome to LockedMe.com******");
            System.out.println("Developed by PPM");
            System.out.println("Please select one from following below options");
            System.out.println("Option 1: Return the current file names in ascending order");
            System.out.println("Option 2:Choose from following options:");
            System.out.println("Option 3: Close the application");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    File[] f=file.listFiles();
                    Arrays.sort(f);

                    for(int i=0;i<f.length;i++){
                        System.out.println(f[i]);
                    }
                    break;
                case 2:
                    boolean temp=true;
                    while(temp){
                        System.out.println("1. Add a file");
                        System.out.println("2. Delete a file");
                        System.out.println("3. Search a file");
                        System.out.println("4. Go back to main menu");
                        System.out.println("5. Close the application");
                        int m=sc.nextInt();

                        switch(m){
                            case 1://Add a file
                            boolean success =false;
                            System.out.println("Enter file name to be created "); 
                            String filename = sc.next(); 
                            File file1 = new File(filename); 
                            if (file1.exists()) { 
                                System.out.println("File already exists");
                            } 
                            else { 
                                System.out.println("No such file exists, creating now"); 
                                
                                    success = file1.createNewFile();
                                
                                    // TODO Auto-generated catch block
                                    if (success) { 
                                        System.out.printf("Successfully created new file: %s%n", file1); 
                                    }
                                     else { 
                                        System.out.printf("Failed to create new file: %s%n", file1); } 
                                
                                
                            }
                            break;

                            case 2://Delete a file
                            System.out.println("Enter file name to be deleted "); 
                            String filename1 = sc.next(); 
                            File file2 = new File(filename1);           //file to be delete  
                            if(file2.delete())                      //returns Boolean value  
                            {  
                            System.out.println(file2.getName() + " deleted");   //getting and printing the file name  
                            }  
                            else  
                            {  
                            System.out.println("File not found");  
                            }  
                            
                            break;

                           
                            case 3://Search a file
                            System.out.println("Enter the desired file name: ");
                            String file4 = sc.next();
                            System.out.println(file4);      
                            
                            String[] list = file.list();
                            System.out.println(Arrays.toString(list));
                            boolean flag = false;      
                            for (int i = 0; i < list.length; i++) {
                                if(file4.equals(list[i])){
                                        flag = true;
                                }
                             }        
                             if(flag){
                                   System.out.println("File Found");
                             }else{
                                  System.out.println("File Not Found");
                              }
                            break;

                        case 4:

                            temp = false;
                            break;

                        case 5:

                            System.out.println("***** Application closed ******");
                            System.exit(0);
                        default:
                            System.out.println("Input correct value and retry");
                           
                        }
                    }
                    break;
            
                    case 3:
                    System.out.println("***** Application closed ******");
                    System.exit(0);
                    
                    default:
                    System.out.println("Input correct value and retry");
                    break;
            }


        }
    }
}
