package org.example.model;

public class Department {

    private Office firstOffice;

    public Department(){

    }

    public void addOffice(String c, int f){
        Office temp = new Office(c,f);
        Office current  = firstOffice;
        if(firstOffice == null){
            firstOffice = temp;
        }else{
            while (current.getNext() != null){
                current = current.getNext();

            }
            current.setNext(temp);
        }


    }

    public void removeEvenFloors(){
        Office current  = firstOffice;
        Office before = null;
        if(firstOffice!= null){
            if(firstOffice.getFloor()%2==0){
                firstOffice=firstOffice.getNext();
            }

        }
        before = firstOffice;
        while(current.getNext() != null){
            if(current.getFloor()%2 == 0){
                before.setNext(before.getNext().getNext());
            }
            before = current;
            current = current.getNext();
        }
    }

    public Office searchOffice(String c){
        Office current  = firstOffice;
        if(current != null){
            if(current.getCode().equals(c)){
                return current;
            }else {
                while (current.getNext() != null && !current.getCode().equals(c)) {
                    current = current.getNext();

                }



            }


        }
        try {
            if(current.getNext() == null && !current.getCode().equals(c)){
                return null;
            }


        }catch (NullPointerException e){
            System.out.println("No se encontraron oficinas");
        }


        return current;

    }




}
