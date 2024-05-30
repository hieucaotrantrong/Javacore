package Buoi20;

public class SapXepChon implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j, min_inx;
        for (i = 0; i < n - 1; i++) {
            min_inx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[min_inx])
                    min_inx = j;
            double temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;

        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j, min_inx;
        for (i = 0; i < n - 1; i++) {
            min_inx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] > arr[min_inx])
                    min_inx = j;
            double temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;

        }
    }

}
