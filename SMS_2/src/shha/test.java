package shha;


/**
 *
 * @author MooseMoose
 */
public class test {
//     private static void testString(String name, String ... setOfStrings) {
//            System.out.println(name);
//            
//            for(String s : setOfStrings) {
//                System.out.print(s);
//            }
//                    
//        }
//     
//     //need to cylce through the setOfStrings array and add it to one string
//     //in the string builder
//      private static void addDataToTable(String tableName, String... setOfStrings) {
//        String sql;
//        System.out.print("INSERT INTO " + tableName + " ");
//        StringBuilder stringS = new StringBuilder();
//        for(String s : setOfStrings) {
//                stringS.append(s);
//            }
//        
//        System.out.print(stringS);
//                
//      }
      
//      private static void generateYears() {
//          for (int i = 1900; i <= 2015; i++) {
//              System.out.print("\"" + i + "\",");
//          }
//      }
       
    public static void main(String[] args) {
        
        Database db = new Database("SMSDB");
        
        /* Create Database
        System.out.println("Creating SMSDB dataBase");
        Database db = new Database("SMSDB","create");
        System.out.println("Exiting creating SMSDB dataBase");
        */
        
        
      
        
          
        //drop the employees table
        
//        System.out.println("Dropping employees table");
//        db.dropTable("employees");
//        System.out.println("Employees table dropped");
        
        //create new empmployees table with a userName
       
        
//        System.out.println("Creating employees table");
//        db.createTable("employees", "(firstName varchar(20), middleInt varchar(10), " +
//                        "lastName varchar(20), username varchar(20), password varchar(20), " +
//                        "position varchar(20), accessLevel int, " +
//                       "ssn varchar(20), sex varchar(10), address1 varchar(100), " +
//                       "address2 varchar(100), city varchar(20), state varchar(20), " +
//                        "zip varchar(5), month varchar(20), day int, " +
//                        "birthYear int, phone varchar(15), " +
//                        "email varchar(20))");
//        System.out.println("Employees table created");
        
        //add entries into the employees table
        
//        String values =  "VALUES ('Test', 'T', 'Tester', 'Admin1', 'Password1', " +
//                                 "'Administrator', 5, '555-55-5555', 'M', '555 The Code Way', " +
//                                "'', 'Atlanta', 'Georgia', '30303', 'December', 12, 1964, " +
//                                "'404-555-5555', 'admin1@sms.com')";
        
        
        
        
                        
//                        
//        System.out.println("Adding users to table");
//        db.addDataToTable("employees", values);
//        System.out.println("Added users to table");
//      
        
         db.createTable("patients", "(firstName varchar(20), middleInt varchar(10), " +
                        "lastName varchar(20), " +
                       "ssn varchar(20), sex varchar(10), address1 varchar(100), " +
                       "address2 varchar(100), city varchar(20), state varchar(20), " +
                        "zip varchar(5), month varchar(20), day int, " +
                        "birthYear int, phone varchar(15), " +
                        "email varchar(20), doctorAssign varchar(20), comments varchar(200)  )");
        System.out.println("Patients table created");
        
        String values =  "VALUES ('Test', 'T', 'Tester', '555-55-5555', " + 
                               " 'M', '555 The Code Way', " +
                                "'', 'Atlanta', 'Georgia', '30303', 'December', 12, 1964, " +
                                "'404-555-5555', 'admin1@sms.com', 'DR. Chuma Obi', 'Severe allergy to computers')";
        
        
          db.addDataToTable("patients", values);
        
          db.printAll("patients");
          
          
          
        
    }
    
}
