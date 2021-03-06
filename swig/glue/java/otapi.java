/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class otapi implements otapiConstants {
  public static boolean InitDefaultStorage(int eStoreType, int ePackType) {
    return otapiJNI.InitDefaultStorage(eStoreType, ePackType);
  }

  public static Storage GetDefaultStorage() {
    long cPtr = otapiJNI.GetDefaultStorage();
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public static Storage CreateStorageContext(int eStoreType, int ePackType) {
    long cPtr = otapiJNI.CreateStorageContext__SWIG_0(eStoreType, ePackType);
    return (cPtr == 0) ? null : new Storage(cPtr, true);
  }

  public static Storage CreateStorageContext(int eStoreType) {
    long cPtr = otapiJNI.CreateStorageContext__SWIG_1(eStoreType);
    return (cPtr == 0) ? null : new Storage(cPtr, true);
  }

  public static Storable CreateObject(int eType) {
    long cPtr = otapiJNI.CreateObject(eType);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static boolean CheckStringsExistInOrder(SWIGTYPE_p_std__string strFolder, SWIGTYPE_p_std__string oneStr, SWIGTYPE_p_std__string twoStr, SWIGTYPE_p_std__string threeStr, String szFuncName) {
    return otapiJNI.CheckStringsExistInOrder__SWIG_0(SWIGTYPE_p_std__string.getCPtr(strFolder), SWIGTYPE_p_std__string.getCPtr(oneStr), SWIGTYPE_p_std__string.getCPtr(twoStr), SWIGTYPE_p_std__string.getCPtr(threeStr), szFuncName);
  }

  public static boolean CheckStringsExistInOrder(SWIGTYPE_p_std__string strFolder, SWIGTYPE_p_std__string oneStr, SWIGTYPE_p_std__string twoStr, SWIGTYPE_p_std__string threeStr) {
    return otapiJNI.CheckStringsExistInOrder__SWIG_1(SWIGTYPE_p_std__string.getCPtr(strFolder), SWIGTYPE_p_std__string.getCPtr(oneStr), SWIGTYPE_p_std__string.getCPtr(twoStr), SWIGTYPE_p_std__string.getCPtr(threeStr));
  }

  public static boolean Exists(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Exists__SWIG_0(strFolder, oneStr, twoStr, threeStr);
  }

  public static boolean Exists(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Exists__SWIG_1(strFolder, oneStr, twoStr);
  }

  public static boolean Exists(String strFolder, String oneStr) {
    return otapiJNI.Exists__SWIG_2(strFolder, oneStr);
  }

  public static boolean Exists(String strFolder) {
    return otapiJNI.Exists__SWIG_3(strFolder);
  }

  public static boolean StoreString(String strContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.StoreString__SWIG_0(strContents, strFolder, oneStr, twoStr, threeStr);
  }

  public static boolean StoreString(String strContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.StoreString__SWIG_1(strContents, strFolder, oneStr, twoStr);
  }

  public static boolean StoreString(String strContents, String strFolder, String oneStr) {
    return otapiJNI.StoreString__SWIG_2(strContents, strFolder, oneStr);
  }

  public static boolean StoreString(String strContents, String strFolder) {
    return otapiJNI.StoreString__SWIG_3(strContents, strFolder);
  }

  public static String QueryString(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.QueryString__SWIG_0(strFolder, oneStr, twoStr, threeStr);
  }

  public static String QueryString(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.QueryString__SWIG_1(strFolder, oneStr, twoStr);
  }

  public static String QueryString(String strFolder, String oneStr) {
    return otapiJNI.QueryString__SWIG_2(strFolder, oneStr);
  }

  public static String QueryString(String strFolder) {
    return otapiJNI.QueryString__SWIG_3(strFolder);
  }

  public static boolean StorePlainString(String strContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.StorePlainString__SWIG_0(strContents, strFolder, oneStr, twoStr, threeStr);
  }

  public static boolean StorePlainString(String strContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.StorePlainString__SWIG_1(strContents, strFolder, oneStr, twoStr);
  }

  public static boolean StorePlainString(String strContents, String strFolder, String oneStr) {
    return otapiJNI.StorePlainString__SWIG_2(strContents, strFolder, oneStr);
  }

  public static boolean StorePlainString(String strContents, String strFolder) {
    return otapiJNI.StorePlainString__SWIG_3(strContents, strFolder);
  }

  public static String QueryPlainString(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.QueryPlainString__SWIG_0(strFolder, oneStr, twoStr, threeStr);
  }

  public static String QueryPlainString(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.QueryPlainString__SWIG_1(strFolder, oneStr, twoStr);
  }

  public static String QueryPlainString(String strFolder, String oneStr) {
    return otapiJNI.QueryPlainString__SWIG_2(strFolder, oneStr);
  }

  public static String QueryPlainString(String strFolder) {
    return otapiJNI.QueryPlainString__SWIG_3(strFolder);
  }

  public static boolean StoreObject(Storable theContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.StoreObject__SWIG_0(Storable.getCPtr(theContents), theContents, strFolder, oneStr, twoStr, threeStr);
  }

  public static boolean StoreObject(Storable theContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.StoreObject__SWIG_1(Storable.getCPtr(theContents), theContents, strFolder, oneStr, twoStr);
  }

  public static boolean StoreObject(Storable theContents, String strFolder, String oneStr) {
    return otapiJNI.StoreObject__SWIG_2(Storable.getCPtr(theContents), theContents, strFolder, oneStr);
  }

  public static boolean StoreObject(Storable theContents, String strFolder) {
    return otapiJNI.StoreObject__SWIG_3(Storable.getCPtr(theContents), theContents, strFolder);
  }

  public static Storable QueryObject(int theObjectType, String strFolder, String oneStr, String twoStr, String threeStr) {
    long cPtr = otapiJNI.QueryObject__SWIG_0(theObjectType, strFolder, oneStr, twoStr, threeStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static Storable QueryObject(int theObjectType, String strFolder, String oneStr, String twoStr) {
    long cPtr = otapiJNI.QueryObject__SWIG_1(theObjectType, strFolder, oneStr, twoStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static Storable QueryObject(int theObjectType, String strFolder, String oneStr) {
    long cPtr = otapiJNI.QueryObject__SWIG_2(theObjectType, strFolder, oneStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static Storable QueryObject(int theObjectType, String strFolder) {
    long cPtr = otapiJNI.QueryObject__SWIG_3(theObjectType, strFolder);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static String EncodeObject(Storable theContents) {
    return otapiJNI.EncodeObject(Storable.getCPtr(theContents), theContents);
  }

  public static Storable DecodeObject(int theObjectType, String strInput) {
    long cPtr = otapiJNI.DecodeObject(theObjectType, strInput);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static boolean EraseValueByKey(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.EraseValueByKey__SWIG_0(strFolder, oneStr, twoStr, threeStr);
  }

  public static boolean EraseValueByKey(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.EraseValueByKey__SWIG_1(strFolder, oneStr, twoStr);
  }

  public static boolean EraseValueByKey(String strFolder, String oneStr) {
    return otapiJNI.EraseValueByKey__SWIG_2(strFolder, oneStr);
  }

  public static boolean EraseValueByKey(String strFolder) {
    return otapiJNI.EraseValueByKey__SWIG_3(strFolder);
  }

  public static boolean OT_API_Set_PasswordCallback(OTCaller theCaller) {
    return otapiJNI.OT_API_Set_PasswordCallback(OTCaller.getCPtr(theCaller), theCaller);
  }

}
