object NanogramRow extends App {

  def countOnes(row: Array[Int])={
    row
      .foldLeft("")(_+_)
      .split("0+")
      .map(_.length)
      .filterNot(_==0)
  }

}
