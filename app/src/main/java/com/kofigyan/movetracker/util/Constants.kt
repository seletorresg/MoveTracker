package com.kofigyan.movetracker.util

const val API_KEY = "AIzaSyCXp468VbtqX0qq_dURY9jTWZVtz-1m61s"

const val BASE_STATIC_MAP_URL = "http://maps.googleapis.com/maps/api/staticmap?"

const val UPDATE_INTERVAL_IN_MILLISECONDS: Long = 5000

/**
 * The fastest rate for active location updates. Updates will never be more frequent
 * than this value.
 */
const val FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = UPDATE_INTERVAL_IN_MILLISECONDS / 2

/**
 *  Values for Static Map
 */
const val DEFAULT_WIDTH_STATIC_MAP = 100
const val DEFAULT_HEIGHT_STATIC_MAP = 100
const val DEFAULT_PATH_WEIGHT_STATIC_MAP = 3
const val DEFAULT_PATH_COLOR = "0xff0000ff"
