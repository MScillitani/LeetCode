class Solution {
    public String defangIPaddr(String address) {
        char[] addressArray = address.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<addressArray.length; i++) {
            if (addressArray[i] == '.') {
                result.append("[.]");
            } else {
                result.append(addressArray[i]);
            }
        }
        return result.toString();
    }
}
