package com.example.android.pets.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.format.Time;




public class PetContract {






    /* Inner class that defines the table contents of the location table */
    public static final class PetEntry implements BaseColumns {


        // Table name
        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed"; // breed
        public static final String COLUMN_PET_GENDER = "gender"; // gender
        public static final String COLUMN_PET_WEIGHT = "weight"; // weight

    /**
     * Possible values for the gender
     */

    public static final int GENDER_UNKNOWN = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;


}


}