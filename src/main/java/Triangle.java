public class Triangle {

  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public int getSide1() {
    return mSide1;
  }

  public int getSide2() {
    return mSide2;
  }

  public int getSide3() {
    return mSide3;
  }

  public boolean isATriangle() {
    if (mSide1 + mSide2 <= mSide3 ||
        mSide3 + mSide2 <= mSide1 ||
        mSide1 + mSide3 <= mSide2){
      return false;
    } else {
      return true;
    }
  }

  public boolean isEquilateral() {
    if ( mSide1 == mSide2 && mSide2 == mSide3) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isIsosceles() {
    if ((mSide1 == mSide2 && mSide2 != mSide3 && mSide1 != mSide3) ||
        (mSide1 == mSide3 && mSide2 != mSide3 && mSide1 != mSide2) ||
        (mSide3 == mSide2 && mSide1 != mSide3 && mSide1 != mSide2)){
      return true;
    } else {
      return false;
    }
  }

  public boolean isScalene(){
    if( mSide1 != mSide2 &&
        mSide2 != mSide3 &&
        mSide1 != mSide3){
      return true;
    } else {
      return false;
    }
  }

  public String triangleBuildResults() {
    if (mSide1 + mSide2 <= mSide3 ||
        mSide3 + mSide2 <= mSide1 ||
        mSide1 + mSide3 <= mSide2){
      return "do not make a triangle, sorry!";
    } else {
        if (isEquilateral()) {
          return "make an equilateral triangle!";
        } else if(isIsosceles()) {
          return "make an isosceles triangle!";
        } else {
          return "make an scalene triangle!";
        }
      }
    }
}
