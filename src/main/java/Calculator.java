public enum Calculator {
    Q{
        public int processing(int x, int y){
            return x + y;
        }
    },
    W{
        public int processing(int x, int y){
            return x - y;
        }
    },
    E{
        public int processing(int x, int y){
            return x * y;
        }
    },
    R{
        public int processing(int x, int y){
            return x / y;
        }
    };

    public abstract int processing(int x, int y);


}
