package tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @author Yuery
 * @date 2020/7/17/0017 - 13:10
 */
public class ProductAllComparator implements Comparator<Product> {
    public int compare(Product p1,Product p2){
        return p2.getReviewCount()*p2.getSaleCount()-p1.getReviewCount()*p1.getSaleCount();
    }

}
