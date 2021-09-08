class medicin {
  String m_name;
  String m_type;
  String m_date;
  int m_price;

  final company = "ahmed medicines";
  static const iso_cirtificate = "11920-2e3";

  String hasCard (bool hasCard) {
    return "your price is ${m_price / 2} \$ after discound";
  }
}
main (List<String> arguments) {
  var first_m = new medicin();
  first_m.m_name = "insulin";
  first_m.m_price = 12;
  first_m.m_type = "brething problems";
  first_m.m_date = "jul/2022";

  print(first_m.company);
  print(medicin.iso_cirtificate);

  print(first_m.hasCard(true));

}