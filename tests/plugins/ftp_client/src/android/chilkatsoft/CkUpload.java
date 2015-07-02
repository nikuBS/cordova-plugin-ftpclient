/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkUpload {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkUpload(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkUpload obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkUpload(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkUpload() {
    this(chilkatJNI.new_CkUpload(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkUpload_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkUpload_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkUpload_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkUpload_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkUpload_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkUpload_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkUpload_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkUpload_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkUpload_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkUpload_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkUpload_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkUpload_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkUpload_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkUpload_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkUpload_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkUpload_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkUpload_SaveLastError(swigCPtr, this, path);
  }

  public int get_ChunkSize() {
    return chilkatJNI.CkUpload_get_ChunkSize(swigCPtr, this);
  }

  public void put_ChunkSize(int newVal) {
    chilkatJNI.CkUpload_put_ChunkSize(swigCPtr, this, newVal);
  }

  public boolean get_Expect100Continue() {
    return chilkatJNI.CkUpload_get_Expect100Continue(swigCPtr, this);
  }

  public void put_Expect100Continue(boolean newVal) {
    chilkatJNI.CkUpload_put_Expect100Continue(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkUpload_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkUpload_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_Hostname(CkString str) {
    chilkatJNI.CkUpload_get_Hostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostname() {
    return chilkatJNI.CkUpload_hostname(swigCPtr, this);
  }

  public void put_Hostname(String newVal) {
    chilkatJNI.CkUpload_put_Hostname(swigCPtr, this, newVal);
  }

  public int get_IdleTimeoutMs() {
    return chilkatJNI.CkUpload_get_IdleTimeoutMs(swigCPtr, this);
  }

  public void put_IdleTimeoutMs(int newVal) {
    chilkatJNI.CkUpload_put_IdleTimeoutMs(swigCPtr, this, newVal);
  }

  public void get_Login(CkString str) {
    chilkatJNI.CkUpload_get_Login(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String login() {
    return chilkatJNI.CkUpload_login(swigCPtr, this);
  }

  public void put_Login(String newVal) {
    chilkatJNI.CkUpload_put_Login(swigCPtr, this, newVal);
  }

  public long get_NumBytesSent() {
    return chilkatJNI.CkUpload_get_NumBytesSent(swigCPtr, this);
  }

  public void get_Password(CkString str) {
    chilkatJNI.CkUpload_get_Password(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String password() {
    return chilkatJNI.CkUpload_password(swigCPtr, this);
  }

  public void put_Password(String newVal) {
    chilkatJNI.CkUpload_put_Password(swigCPtr, this, newVal);
  }

  public void get_Path(CkString str) {
    chilkatJNI.CkUpload_get_Path(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String path() {
    return chilkatJNI.CkUpload_path(swigCPtr, this);
  }

  public void put_Path(String newVal) {
    chilkatJNI.CkUpload_put_Path(swigCPtr, this, newVal);
  }

  public long get_PercentUploaded() {
    return chilkatJNI.CkUpload_get_PercentUploaded(swigCPtr, this);
  }

  public int get_Port() {
    return chilkatJNI.CkUpload_get_Port(swigCPtr, this);
  }

  public void put_Port(int newVal) {
    chilkatJNI.CkUpload_put_Port(swigCPtr, this, newVal);
  }

  public boolean get_PreferIpv6() {
    return chilkatJNI.CkUpload_get_PreferIpv6(swigCPtr, this);
  }

  public void put_PreferIpv6(boolean newVal) {
    chilkatJNI.CkUpload_put_PreferIpv6(swigCPtr, this, newVal);
  }

  public void get_ProxyDomain(CkString str) {
    chilkatJNI.CkUpload_get_ProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxyDomain() {
    return chilkatJNI.CkUpload_proxyDomain(swigCPtr, this);
  }

  public void put_ProxyDomain(String newVal) {
    chilkatJNI.CkUpload_put_ProxyDomain(swigCPtr, this, newVal);
  }

  public void get_ProxyLogin(CkString str) {
    chilkatJNI.CkUpload_get_ProxyLogin(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxyLogin() {
    return chilkatJNI.CkUpload_proxyLogin(swigCPtr, this);
  }

  public void put_ProxyLogin(String newVal) {
    chilkatJNI.CkUpload_put_ProxyLogin(swigCPtr, this, newVal);
  }

  public void get_ProxyPassword(CkString str) {
    chilkatJNI.CkUpload_get_ProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxyPassword() {
    return chilkatJNI.CkUpload_proxyPassword(swigCPtr, this);
  }

  public void put_ProxyPassword(String newVal) {
    chilkatJNI.CkUpload_put_ProxyPassword(swigCPtr, this, newVal);
  }

  public int get_ProxyPort() {
    return chilkatJNI.CkUpload_get_ProxyPort(swigCPtr, this);
  }

  public void put_ProxyPort(int newVal) {
    chilkatJNI.CkUpload_put_ProxyPort(swigCPtr, this, newVal);
  }

  public void get_ResponseBody(CkByteData outBytes) {
    chilkatJNI.CkUpload_get_ResponseBody(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void get_ResponseHeader(CkString str) {
    chilkatJNI.CkUpload_get_ResponseHeader(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String responseHeader() {
    return chilkatJNI.CkUpload_responseHeader(swigCPtr, this);
  }

  public int get_ResponseStatus() {
    return chilkatJNI.CkUpload_get_ResponseStatus(swigCPtr, this);
  }

  public boolean get_Ssl() {
    return chilkatJNI.CkUpload_get_Ssl(swigCPtr, this);
  }

  public void put_Ssl(boolean newVal) {
    chilkatJNI.CkUpload_put_Ssl(swigCPtr, this, newVal);
  }

  public long get_TotalUploadSize() {
    return chilkatJNI.CkUpload_get_TotalUploadSize(swigCPtr, this);
  }

  public boolean get_UploadInProgress() {
    return chilkatJNI.CkUpload_get_UploadInProgress(swigCPtr, this);
  }

  public boolean get_UploadSuccess() {
    return chilkatJNI.CkUpload_get_UploadSuccess(swigCPtr, this);
  }

  public int get_PercentDoneScale() {
    return chilkatJNI.CkUpload_get_PercentDoneScale(swigCPtr, this);
  }

  public void put_PercentDoneScale(int newVal) {
    chilkatJNI.CkUpload_put_PercentDoneScale(swigCPtr, this, newVal);
  }

  public int get_BandwidthThrottleUp() {
    return chilkatJNI.CkUpload_get_BandwidthThrottleUp(swigCPtr, this);
  }

  public void put_BandwidthThrottleUp(int newVal) {
    chilkatJNI.CkUpload_put_BandwidthThrottleUp(swigCPtr, this, newVal);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkUpload_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkUpload_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkUpload_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public void AbortUpload() {
    chilkatJNI.CkUpload_AbortUpload(swigCPtr, this);
  }

  public void AddCustomHeader(String name, String value) {
    chilkatJNI.CkUpload_AddCustomHeader(swigCPtr, this, name, value);
  }

  public void AddFileReference(String name, String filename) {
    chilkatJNI.CkUpload_AddFileReference(swigCPtr, this, name, filename);
  }

  public void AddParam(String name, String value) {
    chilkatJNI.CkUpload_AddParam(swigCPtr, this, name, value);
  }

  public boolean BeginUpload() {
    return chilkatJNI.CkUpload_BeginUpload(swigCPtr, this);
  }

  public boolean BlockingUpload() {
    return chilkatJNI.CkUpload_BlockingUpload(swigCPtr, this);
  }

  public void ClearFileReferences() {
    chilkatJNI.CkUpload_ClearFileReferences(swigCPtr, this);
  }

  public void ClearParams() {
    chilkatJNI.CkUpload_ClearParams(swigCPtr, this);
  }

  public void SleepMs(int millisec) {
    chilkatJNI.CkUpload_SleepMs(swigCPtr, this, millisec);
  }

  public boolean UploadToMemory(CkByteData outData) {
    return chilkatJNI.CkUpload_UploadToMemory(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

}
