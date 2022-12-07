public class Employee {

    public class Employee {

        private String Name;
        private int PPSid;
        private long Phone;
        private String Gender;
        private String EmploymentType;
        private int Age;

        public Employee(String name, int PPSid, long phone, String gender, String employmentType, int age) {
            Name = name;
            this.PPSid = PPSid;
            Phone = phone;
            Gender = gender;
            EmploymentType = employmentType;
            Age = age;
        }


        public String getName() {
            return Name;
        }

        public void setName(String name) {
            if(name.length() > 5 || name.length() <= 22) {
                this.Name = name;
            } else {
                throw new IllegalArgumentException("Invalid Name Error");
            }

        }

        public int getPPSid() {
            return PPSid;
        }

        public void setPPSid(int PPSid) {
            if (String.valueOf(PPSid).length() > 6) {
            this.PPSid = PPSid;
        } else {
                throw new IllegalArgumentException("Invalid PPS number Error");
            }
        }

        public long getPhone() {
            return Phone;
        }

        public void setPhone(long phone) {
            if (String.valueOf(phone).length() <= 11) {
                this.Phone = phone;
            } else {
                throw new IllegalArgumentException("Invalid Phone Number Error");
            }
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            this.Gender = gender;
        }

        public String getEmploymentType() {
            return EmploymentType;
        }

        public void setEmploymentType(String employmentType) {
            this.EmploymentType = employmentType;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            this.Age = age;
        }
    }

}
