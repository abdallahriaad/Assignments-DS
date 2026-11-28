class Main {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 58, 7, 21, 45, 90 };
        System.out.println(linearSearch(arr, 45));
        System.out.println(linearSearch(arr, 100));
        System.out.println(linearSearch(arr, 34));

        int[] arr2 = { 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60 };
        System.out.println(binarySearch(arr2, 44, 0, arr2.length - 1));
        System.out.println(binarySearch(arr2, 10, 0, arr2.length - 1));
        System.out.println(binarySearch(arr2, 60, 0, arr2.length - 1));

        // 120221864 - Abdallah Riad AbuGhorab
    }

    public static int linearSearch(int[] data, int target) {
        if (data == null)
            return -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;
        if (data[mid] == target) {
            return true;
        } else if (target < data[mid]) {
            return binarySearch(data, target, low, mid - 1);
        } else {
            return binarySearch(data, target, mid + 1, high);
        }
    }
}