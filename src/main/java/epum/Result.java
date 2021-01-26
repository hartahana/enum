//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;
//хранит последовательность, операцию и результат расчета

class Result {
    int[] array;
    double result;
    String oper;

    Result(int[] input, String oper) {
        this.array = input;
        this.oper = oper;
    }
//берем операцию, сравниваем с нужной, выбираем и считаем
    void Oper() {
        epum.Operation op;
        if (this.oper.equals("max")) {
            op = epum.Operation.MAX;
            this.result = op.action(this.array);
        }

        if (this.oper.equals("min")) {
            op = epum.Operation.MIN;
            this.result = op.action(this.array);
        }

        if (this.oper.equals("avg")) {
            op = epum.Operation.AVG;
            this.result = op.action(this.array);
        }

    }
}
