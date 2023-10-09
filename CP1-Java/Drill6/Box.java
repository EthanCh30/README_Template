public class Box {
        private int width;
        private int height;
        private int depth;
        private String builder;

        // First constructor
        public Box(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.builder = null; // No builder specified
        }

        // Second constructor
        public Box(int width, int height, int depth, String builder) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.builder = builder;
        }

        // Method to return box details as a string
        public String printMe() {
            StringBuilder sb = new StringBuilder("Box built.\n");
            sb.append("  Width: ").append(this.width).append("\n");
            sb.append("  Height: ").append(this.height).append("\n");
            sb.append("  Depth: ").append(this.depth).append("\n");
            sb.append("  Built by ").append(this.builder == null ? "null" : this.builder);
            return sb.toString();
        }
}
