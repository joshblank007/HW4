package com.mycompany.agency;


public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList

        staffList[0] = new Executive("Jane Smith", "456 Elm St", "555-5678", "15-25-020", 65);
        staffList[1] = new StaffEmployee("Charlie Brown", "333 Cedar St", "555-1111", "27-84-963", 40);
        staffList[2] = new TempEmploee("Alice Johnson", "789 Oak St", "555-9876", "02-89-585", 35);
        staffList[3] = new TempEmploee("Eva Davis", "222 Maple St", "555-8765", "17-65-875", 25);
        staffList[4] = new Intern("John Doe", "123 Main St", "555-1234");
        staffList[5] = new Intern("Bob Williams", "101 Pine St", "555-4321");

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[2]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount = 0.0;

        for (int i=0; i<staffList.length;i++) {
            System.out.printf("Employee - %d\n" + staffList[i], i+1);

            //Check if staffMember is an intern
            if(!(staffList[i] instanceof Intern)) {
                amount = staffList[i].pay();  // polymorphic
            }
            if (amount == 0.0)
                System.out.println("\n-- DONE ---!");
            else
                System.out.println("\nPaid: " + amount);

            System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + +");
        }
    }
}