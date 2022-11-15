package com.skillbox.aslanbolurov.android.nasa_recyclerview.data


import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.CameraField
import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.MarsPhotos
import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.MarsPhotosArray
import com.skillbox.aslanbolurov.android.nasa_recyclerview.entity.RoverField
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CameraFieldDto(
    override var id: Int,
    override var name: String,
    override var rover_id: Int,
    override var full_name: String
):CameraField

@JsonClass(generateAdapter = true)
data class RoverFieldDto(
    override var id: Int,
    override var name: String,
    override var landing_date: String,
    override var launch_date: String,
    override var status: String
):RoverField


@JsonClass(generateAdapter = true)
data class MarsPhotosArrayDto(
    override var id: Int,
    override var sol: Int,
    override var camera: CameraFieldDto,
    override var img_src: String,
    override var earth_date: String,
    override var rover: RoverFieldDto

) : MarsPhotosArray {
}

@JsonClass(generateAdapter = true)
class MarsPhotosDto(
    val photos: Array<MarsPhotosArrayDto>
)





