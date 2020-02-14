package com.kofigyan.movetracker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.kofigyan.movetracker.model.EventWithLocations
import com.kofigyan.movetracker.model.Status
import com.kofigyan.movetracker.repository.TrackerRepository
import javax.inject.Inject

class EventViewModel @Inject constructor(
    repository: TrackerRepository
) : ViewModel() {


    val allEventsWithLocations: LiveData<List<EventWithLocations>> =
        repository.allEventsWithLocations


    val status: LiveData<Status> = Transformations.map(allEventsWithLocations) {eventLocations: List<EventWithLocations> ->
        eventLocations?.let {
                when(it.size) {
                    0 -> Status.EMPTY
                    else -> Status.LOADED
                }
            }
    }

}