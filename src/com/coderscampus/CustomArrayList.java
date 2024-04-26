package com.coderscampus;


    public class CustomArrayList<T> implements CustomList<T> {

        Object[] items = new Object[10];
        int index = 0;





        @Override
        public boolean add(T item) {
            if(item==null) {

                return false;
            }


            System.out.println(index);
            if (items.length == index) {
                items = Arrays.copyOf(items, items.length*2);
                items[index]= item;
                index++;
            }else {
                items[index]= item;
                index++;
            }


            return true;
        }

        @Override
        public int getSize() {
            int itemSize = items.length;
            //	System.out.println("Number of items in the array: " + itemSize);
            return itemSize;
        }

        @Override
        public T get(int index) {

            return (T) items[index];

        }

    }


