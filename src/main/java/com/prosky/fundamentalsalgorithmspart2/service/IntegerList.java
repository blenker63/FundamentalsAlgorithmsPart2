package com.prosky.fundamentalsalgorithmspart2.service;

import java.util.Arrays;

public class IntegerList implements IntegerListService {
    private static Integer[] IntegerList = new Integer[5];
    private int size = 0;
    public int index = 0;
    public Integer removeItem;

    @Override
    public Integer add(Integer item) {
        if (size < IntegerList.length) {
            IntegerList[index] = item;
            size++;
            index++;
            return IntegerList[index - 1];
        } else {
            throw new ArrayIndexOutBondsException("Массив переполнен");
        }
    }

    @Override
    public Integer add(int index, Integer item) {
//        if (size >= (IntegerList.length) || index >= IntegerList.length - 1) {
        if (index > size || index >= IntegerList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы количества элементов или массива.");
        }
        for (int i = IntegerList.length - 1; i == index; i--) {
            IntegerList[i] = IntegerList[i - 1];
        }
        IntegerList[index] = item;
        size++;
        return IntegerList[index];
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index >= size || index >= IntegerList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы количества элементов или массива.");
        }
        IntegerList[index] = item;

        return IntegerList[index];
    }

    @Override
    public Integer remove(Integer item) {
        for (int i = 0; i < IntegerList.length - 1; i++) {
            if (IntegerList[i] == item) {
                removeItem = IntegerList[i];
                IntegerList[i] = 0;
                size--;
                break;
            }
            for (int j = i; j < IntegerList.length - 1; j++) {
                IntegerList[j] = IntegerList[i + 1];
            }
        }
        return removeItem;
    }

    @Override
    public Integer remove(int index) {
        if (index > IntegerList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы массива");
        }
        if (IntegerList[index] == 0) {
            throw new ElementMissingException("Элемент отсутствует");
        } else {
            removeItem = IntegerList[index];
            IntegerList[index] = 0;
            size--;
        }
        for (int i = index; i < IntegerList.length - 1; i++) {
            IntegerList[i] = IntegerList[index + 1];
        }

        return removeItem;
    }


    @Override
    public boolean contains(Integer item) {
        Integer[] containsItem = sorting();
        int a = 0;
        for (int b = containsItem.length - 1; b >= 0; b--) {
            if (containsItem[b] == null) {
            } else {
                a = b;
                break;
            }
        }
        int min1 = 0;
//            int max1 = IntegerList.length - 1;
        int max1 = a - 1;

        while (min1 < max1) {
            int mid = (min1 + max1) / 2;

            if (item == containsItem[mid]) {
//                    containsBinaryItem = true;
                return true;
            }
            if (item < containsItem[mid]) {
                max1 = mid + 1;
            } else {
                min1 = mid + 1;
            }
        }

//    }
        return false;
//        return containsBinaryItem;
    }

//        int min = 0;
//        int max = containsItem.length - 1;
//
//        while (min < max) {
//            int mid = (min + max) / 2;
//
//            if (item == containsItem[mid]) {
//                return true;
//            }
//            if (item < containsItem[mid]) {
//                max = mid + 1;
//            } else {
//                min = mid + 1;
//            }
//        }
//        return false;

//    }

    @Override
    public int indexOf(Integer item) {
        int indexOf = -1;
        for (int i = 0; i < IntegerList.length; i++) {
            if (IntegerList[i] == item) {
                indexOf = i;
            }
        }
        return indexOf;

    }

    @Override
    public int lastIndexOf(Integer item) {
        int LastIndexOf = -1;
        for (int i = IntegerList.length - 1; i >= 0; i--) {
            if (IntegerList[i] == item) {
                LastIndexOf = i;
                break;
            }
        }
        return LastIndexOf;

    }

    @Override
    public Integer get(int index) {
        Integer getItem = null;
        if (index > IntegerList.length - 1) {
            throw new ArrayIndexOutBondsException("Индекс выходит за пределы массива");
        }
        getItem = IntegerList[index];
        return getItem;
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < IntegerList.length; i++) {
            if (IntegerList[i] == 0) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    @Override
    public Object clear() {
        for (int i = 0; i < IntegerList.length; i++) {
            IntegerList[i] = 0;
        }
        return null;
    }

    @Override
    public Integer[] toArray() {
        int n = IntegerList.length;
        Integer[] toArrayMas = null;
        Integer[] toArray = Arrays.copyOf(IntegerList, n);
        toArrayMas = toArray;
        return toArrayMas;
    }

    public Integer[] sorting() {
        Integer[] arrays = null;
        Integer[] arraySorting = toArray();
        int a = 0;
        for (int b = arraySorting.length - 1; b >= 0; b--) {
            if (arraySorting[b] == null) {
            } else {
                a = b;
                break;
            }
            for (int i = 0; i < a; i++) {
                Integer temp = arraySorting[i];
                int j = i;
                while (j > 0 && arraySorting[j - 1] >= temp) {
                    arraySorting[j] = arraySorting[j - 1];
                    j--;
                }
                arraySorting[j] = temp;
            }
        }
        arrays = arraySorting;
        return arrays;
    }

//    public static boolean containsBinary(Integer item) {
//
////        boolean containsBinaryItem = false;
//        int a = 0;
//        for (int b = IntegerList.length - 1; b >= 0; b--) {
//            if (IntegerList[b] == null) {
//            } else {
//                a = b;
//                break;
//            }
//        }
//        int min1 = 0;
////            int max1 = IntegerList.length - 1;
//        int max1 = a - 1;
//
//        while (min1 < max1) {
//            int mid = (min1 + max1) / 2;
//
//            if (item == IntegerList[mid]) {
////                    containsBinaryItem = true;
//                return true;
//            }
//            if (item < IntegerList[mid]) {
//                max1 = mid + 1;
//            } else {
//                min1 = mid + 1;
//            }
//        }
//
////    }
//            return false;
////        return containsBinaryItem;
//}
}




