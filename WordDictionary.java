import java.util.*;
class WordDictionary
{
   // Create a hashtable object.
    Hashtable<String,String> w_dictionary;
   // Create a constructor of WordDictionary class and create a hashtable.
   WordDictionary()
   {
   w_dictionary=new Hashtable<String,String>();
   }
   //Create a method to add words with their definition
   void addWord(String word,String definition)
   {
    //Check if the word already exists
    if(w_dictionary.containsKey(word.toLowerCase()))
    {
        System.out.println();
        System.out.println(word+" already exists in the dictionary.");
        System.out.println("----------------------------");
    }
    else
    {
     //Add the word and its definition in the dictionary
      w_dictionary.put(word.toLowerCase(),definition);
      System.out.println();
      System.out.println(word+" has been added successfully to the dictionary.");
      System.out.println("------------------------");
    }
   }
  //Create a method to delete the given word.
   void delWord(String del_word)
   {
    //If the word exists remove it from the dictionary.
    if(w_dictionary.containsKey(del_word.toLowerCase()))
    {
      w_dictionary.remove(del_word.toLowerCase());
      System.out.println();
      System.out.println(del_word+" has been deleted successfully from the dictionary.");
      System.out.println("----------------------------");
    }
    else
    {
      System.out.println();
      System.out.println(del_word+" does not exist in the dictionary.");
      System.out.println("---------------------------------------");
    }
   }
  //Create a method to search the given word.
   void searchWord(String search_word)
   {
    if(w_dictionary.containsKey(search_word.toLowerCase()))
    {
        //If the word exists,print the word along with its definition.
        String s_word=w_dictionary.get(search_word.toLowerCase());
        System.out.println();
        System.out.println(search_word+" has been found in the dictionary.");
        System.out.println("----------------------------");
        System.out.println("Word: "+search_word+"-->Definition: "+s_word);
        System.out.println("----------------------------");
    }
    else
    {
        System.out.println();
        System.out.println(search_word+" has not been found in the dictionary.");
        System.out.println("----------------------------");
    }
   }
   //Create a method to update the given word.
   void updateWord(String word,String definition)
   {
    //Update the word if it exists
    if(w_dictionary.containsKey(word.toLowerCase()))
    {
        w_dictionary.remove(word.toLowerCase());
        w_dictionary.put(word.toLowerCase(),definition);
        System.out.println();
        System.out.println(word+" has been updated successfully.");
        System.out.println("------------------------------------");
    }
    else
    {
        System.out.println();
        System.out.println(word+" does not exist.");
        System.out.println("---------------------");
    }
   }
  //Create a method to display the hashtable
   void display()
   {
    //Check if the hashtable is empty or not.
    if(w_dictionary.isEmpty())
    {
        System.out.println();
        System.out.println("The dictionary is empty");
        System.out.println("----------------------------");
    }
    else
    {
        //Display the hashtable by using for-each loop.
    for (Map.Entry<String, String> entry : w_dictionary.entrySet()) {
        String word = entry.getKey();
        String definition = entry.getValue();
        System.out.println("Word: " + word + "--> Definition: " + definition);
   }
   }
}
   //Create a method to display the hashtable in sorted manner.
    void sortedDisplay()
    {
        //Check if the hashtable is empty or not.
        if(w_dictionary.isEmpty())
        {
          System.out.println();
          System.out.println("The dictionary is empty");
          System.out.println("----------------------------"); 
        }
        else
        {
            //Store the hashtable in an arraylist.
            List<String> sortedKeys = new ArrayList<>(w_dictionary.keySet());
            Collections.sort(sortedKeys);
           //Print the arraylist by using for-each loop.
        for (String word : sortedKeys) {
            String definition = w_dictionary.get(word);
            System.out.println("Word: " + word + "--> Definition: " + definition);
        }
    } 
 }
}
class main11
{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //Create a object of WordDictionary class.
    WordDictionary wd=new WordDictionary();
    //Create a while loop.
    while(true)
    {
        System.out.println("Enter the function you want to perform:");
        System.out.println("1. Add a word.");
        System.out.println("----------------");
        System.out.println("2. Delete a word.");
        System.out.println("----------------");
        System.out.println("3. Search a word.");
        System.out.println("----------------");
        System.out.println("4. Update a word.");
        System.out.println("----------------");
        System.out.println("5. Display the dictionary.");
        System.out.println("----------------");
        System.out.println("6. Display the dictionary in sorted order.");
        System.out.println("----------------");
        System.out.println("7. Exit.");
        System.out.println("----------------");
        int choice=sc.nextInt();
        //Create a switch case to ask the user for whatever function they want to perform.
        switch (choice) 
        {
          case 1:
            sc.nextLine();
            System.out.println("Enter the word you want to add");
            String word=sc.nextLine();
            System.out.println("Enter the word's definition:");
            String definition=sc.nextLine();
            wd.addWord(word, definition);
            break;

            case 2:
            sc.nextLine();
            System.out.println("Enter the word you want to delete:");
            String del_word=sc.nextLine();
            wd.delWord(del_word);
            break;

            case 3:
            sc.nextLine();
            System.out.println("Enter the word you want to search:");
            String search_word=sc.nextLine();
            wd.searchWord(search_word);
            break;
            
            case 4:
            sc.nextLine();
            System.out.println("Enter the word you want to update:");
            String up_word=sc.nextLine();
            System.out.println("Enter the updated definition.");
            String up_def=sc.nextLine();
            wd.updateWord(up_word,up_def);
            break;

            case 5:
            wd.display();
            break;
            
            case 6:
            wd.sortedDisplay();
            break;

            case 7:
            System.out.println("Exiting...");
            System.exit(0);
            break;

            default:
            System.out.println("Invalid choice.Enter again.");
            System.out.println();
            break;
        }
    }
   }
}