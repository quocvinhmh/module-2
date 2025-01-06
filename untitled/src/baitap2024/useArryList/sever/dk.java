package baitap2024.useArryList.sever;

public class dk {
        private int id;
        private String name;
        public dk() {
        }
        public dk(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "dk{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

