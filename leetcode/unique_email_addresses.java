class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet < String > valid = new HashSet < > ();

        for (String email: emails)
            will_recieve(valid, email);

        return valid.size();

    }

    public void will_recieve(HashSet < String > valid, String email) {
        String[] local_domain = email.split("@", 2);
        String local_name = local_domain[0];
        String domain_name = local_domain[1];


        StringBuilder local_name_cleaned = new StringBuilder();

        if (domain_name.contains(".com") && domain_name.length() > 4) {
            if (local_name.indexOf('.') != -1 || local_name.indexOf('+') != -1) {
                for (int i = 0; i < local_name.length(); i++) {
                    if (local_name.charAt(i) == '.')
                        continue;
                    if (local_name.charAt(i) == '+')
                        break;
                    local_name_cleaned.append(local_name.charAt(i));
                }

            } else local_name_cleaned.append(local_name);

            local_name_cleaned.append('@');
            local_name_cleaned.append(domain_name);

            valid.add(local_name_cleaned.toString());


        }
    }
}
