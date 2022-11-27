cleari()
drawStage(randomColor)
setSpeed(fast)


class quadrato(l:Int) {
  val pic = Picture.rectangle(l, l)
  pic.setPenColor(randomColor)
pic.setFillColor(randomColor)
  def draw() {
  pic.draw()
  }
}
val br = new quadrato (100)
br.draw()