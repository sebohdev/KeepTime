package de.seboh.task.time.tracker.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import de.seboh.task.time.tracker.R
import de.seboh.task.time.tracker.databinding.RowTaskTrackerBinding

class TaskViewAdapter(
    var items: List<TaskView>,
    private val viewModel: TaskViewModel
) : RecyclerView.Adapter<TaskViewAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(val taskBinding: RowTaskTrackerBinding): RecyclerView.ViewHolder(taskBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewAdapter.TaskViewHolder {

        val binding = DataBindingUtil.inflate<RowTaskTrackerBinding>(
            LayoutInflater.from(parent.context),
            R.layout.row_task_tracker,
            parent,
            false
        )
        return TaskViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: TaskViewAdapter.TaskViewHolder, position: Int) {
        val item = items[position]
        holder.taskBinding.taskView = item
    }


}