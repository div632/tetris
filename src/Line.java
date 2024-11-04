class Line extends Movement {
        @Override
        public void moveLeft() {
            System.out.println("LEFT");
        }

        @Override
        public void moveRight() {
            System.out.println("RIGHT");
        }

        @Override
        public void rotate() {
            System.out.println("I-ROTATE");
        }

        @Override
        public void moveDown() {
            System.out.println("DOWN");
        }
    }


