import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.R
import com.example.googleplaystore.Apps
import com.example.googleplaystore.Departments
import com.example.w7_recyclerview.Adapter.HorizontalRecyclerView

class VerticalRecyclerView(private val departmentList: ArrayList<Departments>) : RecyclerView.Adapter<VerticalRecyclerView.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return departmentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = departmentList[position]
        holder.titleDepartment.text = currentItem.titleDepartment
        val appAdapter = HorizontalRecyclerView(currentItem.apps as ArrayList<Apps>)
        holder.childRecyclerView.adapter = appAdapter
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleDepartment: TextView = itemView.findViewById(R.id.title_department)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.child_recyclerView)


    }

}