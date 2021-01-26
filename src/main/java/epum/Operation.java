//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;

//вычисляем максимум, среднее, минимум
enum Operation {

    MAX {
        double action(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    },

    AVG {
        double action(int[] arr) {
            int sum = 0;

            for (int i = 0; i < arr.length; ++i) {
                sum += arr[i];
            }

            double avg = (double) (sum / arr.length);
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
