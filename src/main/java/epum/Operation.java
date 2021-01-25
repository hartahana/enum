//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;

enum Operation {

    MAX {
        double action(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; ++i) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    },

    AVG {
        double action(int[] array) {
            int sum = 0;

            for (int i = 0; i < array.length; ++i) {
                sum += array[i];
            }

            double avg = (double) (sum / array.length);
            return avg;
        }
    },

    MIN {
        double action(int[] arr) {
            int min = arr[0];

            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            return (double) min;
        }
    };

    private Operation() {
    }

    abstract double action(int[] var1);
}
