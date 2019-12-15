import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.will.ireaderx.R
import com.will.ireaderx.model.BookInfo

class BookListAdapter: RecyclerView.Adapter<BookListAdapter.BookInfoViewHolder>(){

    var data: Array<BookInfo> = Array(0){i -> BookInfo()}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookInfoViewHolder {
        return BookInfoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_book_info,parent,false))
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

    override fun onBindViewHolder(holder: BookInfoViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class BookInfoViewHolder(item: View): RecyclerView.ViewHolder(item){
        var name: TextView? = null
        var size: TextView? = null
        init {
            name = item.findViewById(R.id.item_book_info_name)
            size = item.findViewById(R.id.item_book_info_size)
        }
    }
}