//
// Created by caiminming on 2017/10/11.
//

#include "dryseed_ndkapplication_NdkJniUtils.h"
/*
 * Class:     dryseed_ndkapplication_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_dryseed_ndkapplication_NdkJniUtils_getCLanguageString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
  }