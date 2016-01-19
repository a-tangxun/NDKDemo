#include "com_example_tx_ndkdemo_MainActivity.h"

JNIEXPORT jint JNICALL Java_com_example_tx_ndkdemo_MainActivity_add
        (JNIEnv * env, jobject obj, jint num1, jint num2){
    return num1+num2;
}