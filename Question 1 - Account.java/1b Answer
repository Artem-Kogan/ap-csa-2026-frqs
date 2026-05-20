public String getShortenedName() {
        String shortName = "";
        if (username.indexOf("-") == -1) {
            return username;
        }
        int index = 0;
        int index2;
        for (int i = 0; i < username.length(); i++) {
            if (username.substring(i).indexOf("-") != -1) {
                index2 = username.substring(i).indexOf("-");
                shortname += username.substring(index, index2 - 1);
                index = index2 + 1;
            }
        }
        return shortName;
    }
