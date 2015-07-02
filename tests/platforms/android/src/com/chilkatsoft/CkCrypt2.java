/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkCrypt2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkCrypt2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkCrypt2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkCrypt2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkCrypt2() {
    this(chilkatJNI.new_CkCrypt2(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkCrypt2_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkCrypt2_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkCrypt2_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkCrypt2_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkCrypt2_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkCrypt2_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkCrypt2_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkCrypt2_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkCrypt2_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkCrypt2_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkCrypt2_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkCrypt2_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkCrypt2_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkCrypt2_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkCrypt2_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkCrypt2_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkCrypt2_SaveLastError(swigCPtr, this, path);
  }

  public int get_BlockSize() {
    return chilkatJNI.CkCrypt2_get_BlockSize(swigCPtr, this);
  }

  public boolean get_CadesEnabled() {
    return chilkatJNI.CkCrypt2_get_CadesEnabled(swigCPtr, this);
  }

  public void put_CadesEnabled(boolean newVal) {
    chilkatJNI.CkCrypt2_put_CadesEnabled(swigCPtr, this, newVal);
  }

  public void get_CadesSigPolicyHash(CkString str) {
    chilkatJNI.CkCrypt2_get_CadesSigPolicyHash(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cadesSigPolicyHash() {
    return chilkatJNI.CkCrypt2_cadesSigPolicyHash(swigCPtr, this);
  }

  public void put_CadesSigPolicyHash(String newVal) {
    chilkatJNI.CkCrypt2_put_CadesSigPolicyHash(swigCPtr, this, newVal);
  }

  public void get_CadesSigPolicyId(CkString str) {
    chilkatJNI.CkCrypt2_get_CadesSigPolicyId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cadesSigPolicyId() {
    return chilkatJNI.CkCrypt2_cadesSigPolicyId(swigCPtr, this);
  }

  public void put_CadesSigPolicyId(String newVal) {
    chilkatJNI.CkCrypt2_put_CadesSigPolicyId(swigCPtr, this, newVal);
  }

  public void get_CadesSigPolicyUri(CkString str) {
    chilkatJNI.CkCrypt2_get_CadesSigPolicyUri(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cadesSigPolicyUri() {
    return chilkatJNI.CkCrypt2_cadesSigPolicyUri(swigCPtr, this);
  }

  public void put_CadesSigPolicyUri(String newVal) {
    chilkatJNI.CkCrypt2_put_CadesSigPolicyUri(swigCPtr, this, newVal);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkCrypt2_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkCrypt2_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkCrypt2_put_Charset(swigCPtr, this, newVal);
  }

  public void get_CipherMode(CkString str) {
    chilkatJNI.CkCrypt2_get_CipherMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cipherMode() {
    return chilkatJNI.CkCrypt2_cipherMode(swigCPtr, this);
  }

  public void put_CipherMode(String newVal) {
    chilkatJNI.CkCrypt2_put_CipherMode(swigCPtr, this, newVal);
  }

  public void get_CompressionAlgorithm(CkString str) {
    chilkatJNI.CkCrypt2_get_CompressionAlgorithm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String compressionAlgorithm() {
    return chilkatJNI.CkCrypt2_compressionAlgorithm(swigCPtr, this);
  }

  public void put_CompressionAlgorithm(String newVal) {
    chilkatJNI.CkCrypt2_put_CompressionAlgorithm(swigCPtr, this, newVal);
  }

  public void get_CryptAlgorithm(CkString str) {
    chilkatJNI.CkCrypt2_get_CryptAlgorithm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cryptAlgorithm() {
    return chilkatJNI.CkCrypt2_cryptAlgorithm(swigCPtr, this);
  }

  public void put_CryptAlgorithm(String newVal) {
    chilkatJNI.CkCrypt2_put_CryptAlgorithm(swigCPtr, this, newVal);
  }

  public void get_EncodingMode(CkString str) {
    chilkatJNI.CkCrypt2_get_EncodingMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encodingMode() {
    return chilkatJNI.CkCrypt2_encodingMode(swigCPtr, this);
  }

  public void put_EncodingMode(String newVal) {
    chilkatJNI.CkCrypt2_put_EncodingMode(swigCPtr, this, newVal);
  }

  public boolean get_FirstChunk() {
    return chilkatJNI.CkCrypt2_get_FirstChunk(swigCPtr, this);
  }

  public void put_FirstChunk(boolean newVal) {
    chilkatJNI.CkCrypt2_put_FirstChunk(swigCPtr, this, newVal);
  }

  public void get_HashAlgorithm(CkString str) {
    chilkatJNI.CkCrypt2_get_HashAlgorithm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hashAlgorithm() {
    return chilkatJNI.CkCrypt2_hashAlgorithm(swigCPtr, this);
  }

  public void put_HashAlgorithm(String newVal) {
    chilkatJNI.CkCrypt2_put_HashAlgorithm(swigCPtr, this, newVal);
  }

  public int get_HavalRounds() {
    return chilkatJNI.CkCrypt2_get_HavalRounds(swigCPtr, this);
  }

  public void put_HavalRounds(int newVal) {
    chilkatJNI.CkCrypt2_put_HavalRounds(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkCrypt2_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkCrypt2_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_IV(CkByteData outBytes) {
    chilkatJNI.CkCrypt2_get_IV(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_IV(CkByteData inBytes) {
    chilkatJNI.CkCrypt2_put_IV(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public boolean get_IncludeCertChain() {
    return chilkatJNI.CkCrypt2_get_IncludeCertChain(swigCPtr, this);
  }

  public void put_IncludeCertChain(boolean newVal) {
    chilkatJNI.CkCrypt2_put_IncludeCertChain(swigCPtr, this, newVal);
  }

  public int get_IterationCount() {
    return chilkatJNI.CkCrypt2_get_IterationCount(swigCPtr, this);
  }

  public void put_IterationCount(int newVal) {
    chilkatJNI.CkCrypt2_put_IterationCount(swigCPtr, this, newVal);
  }

  public int get_KeyLength() {
    return chilkatJNI.CkCrypt2_get_KeyLength(swigCPtr, this);
  }

  public void put_KeyLength(int newVal) {
    chilkatJNI.CkCrypt2_put_KeyLength(swigCPtr, this, newVal);
  }

  public boolean get_LastChunk() {
    return chilkatJNI.CkCrypt2_get_LastChunk(swigCPtr, this);
  }

  public void put_LastChunk(boolean newVal) {
    chilkatJNI.CkCrypt2_put_LastChunk(swigCPtr, this, newVal);
  }

  public int get_NumSignerCerts() {
    return chilkatJNI.CkCrypt2_get_NumSignerCerts(swigCPtr, this);
  }

  public int get_PaddingScheme() {
    return chilkatJNI.CkCrypt2_get_PaddingScheme(swigCPtr, this);
  }

  public void put_PaddingScheme(int newVal) {
    chilkatJNI.CkCrypt2_put_PaddingScheme(swigCPtr, this, newVal);
  }

  public void get_PbesAlgorithm(CkString str) {
    chilkatJNI.CkCrypt2_get_PbesAlgorithm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pbesAlgorithm() {
    return chilkatJNI.CkCrypt2_pbesAlgorithm(swigCPtr, this);
  }

  public void put_PbesAlgorithm(String newVal) {
    chilkatJNI.CkCrypt2_put_PbesAlgorithm(swigCPtr, this, newVal);
  }

  public void get_PbesPassword(CkString str) {
    chilkatJNI.CkCrypt2_get_PbesPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pbesPassword() {
    return chilkatJNI.CkCrypt2_pbesPassword(swigCPtr, this);
  }

  public void put_PbesPassword(String newVal) {
    chilkatJNI.CkCrypt2_put_PbesPassword(swigCPtr, this, newVal);
  }

  public void get_Pkcs7CryptAlg(CkString str) {
    chilkatJNI.CkCrypt2_get_Pkcs7CryptAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pkcs7CryptAlg() {
    return chilkatJNI.CkCrypt2_pkcs7CryptAlg(swigCPtr, this);
  }

  public void put_Pkcs7CryptAlg(String newVal) {
    chilkatJNI.CkCrypt2_put_Pkcs7CryptAlg(swigCPtr, this, newVal);
  }

  public int get_Rc2EffectiveKeyLength() {
    return chilkatJNI.CkCrypt2_get_Rc2EffectiveKeyLength(swigCPtr, this);
  }

  public void put_Rc2EffectiveKeyLength(int newVal) {
    chilkatJNI.CkCrypt2_put_Rc2EffectiveKeyLength(swigCPtr, this, newVal);
  }

  public void get_Salt(CkByteData outBytes) {
    chilkatJNI.CkCrypt2_get_Salt(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_Salt(CkByteData inBytes) {
    chilkatJNI.CkCrypt2_put_Salt(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public void get_SecretKey(CkByteData outBytes) {
    chilkatJNI.CkCrypt2_get_SecretKey(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_SecretKey(CkByteData inBytes) {
    chilkatJNI.CkCrypt2_put_SecretKey(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public void get_UuFilename(CkString str) {
    chilkatJNI.CkCrypt2_get_UuFilename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uuFilename() {
    return chilkatJNI.CkCrypt2_uuFilename(swigCPtr, this);
  }

  public void put_UuFilename(String newVal) {
    chilkatJNI.CkCrypt2_put_UuFilename(swigCPtr, this, newVal);
  }

  public void get_UuMode(CkString str) {
    chilkatJNI.CkCrypt2_get_UuMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uuMode() {
    return chilkatJNI.CkCrypt2_uuMode(swigCPtr, this);
  }

  public void put_UuMode(String newVal) {
    chilkatJNI.CkCrypt2_put_UuMode(swigCPtr, this, newVal);
  }

  public void AddEncryptCert(CkCert cert) {
    chilkatJNI.CkCrypt2_AddEncryptCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean AddPfxSourceData(CkByteData pfxData, String password) {
    return chilkatJNI.CkCrypt2_AddPfxSourceData(swigCPtr, this, CkByteData.getCPtr(pfxData), pfxData, password);
  }

  public boolean AddPfxSourceFile(String pfxFilePath, String password) {
    return chilkatJNI.CkCrypt2_AddPfxSourceFile(swigCPtr, this, pfxFilePath, password);
  }

  public boolean ByteSwap4321(CkByteData data, CkByteData outBytes) {
    return chilkatJNI.CkCrypt2_ByteSwap4321(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean BytesToString(CkByteData inData, String charset, CkString outStr) {
    return chilkatJNI.CkCrypt2_BytesToString(swigCPtr, this, CkByteData.getCPtr(inData), inData, charset, CkString.getCPtr(outStr), outStr);
  }

  public String bytesToString(CkByteData inData, String charset) {
    return chilkatJNI.CkCrypt2_bytesToString(swigCPtr, this, CkByteData.getCPtr(inData), inData, charset);
  }

  public boolean CkDecryptFile(String srcFile, String destFile) {
    return chilkatJNI.CkCrypt2_CkDecryptFile(swigCPtr, this, srcFile, destFile);
  }

  public boolean CkEncryptFile(String srcFile, String destFile) {
    return chilkatJNI.CkCrypt2_CkEncryptFile(swigCPtr, this, srcFile, destFile);
  }

  public void ClearEncryptCerts() {
    chilkatJNI.CkCrypt2_ClearEncryptCerts(swigCPtr, this);
  }

  public boolean CompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_CompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean CompressBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_CompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String compressBytesENC(CkByteData data) {
    return chilkatJNI.CkCrypt2_compressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean CompressString(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_CompressString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean CompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_CompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String compressStringENC(String str) {
    return chilkatJNI.CkCrypt2_compressStringENC(swigCPtr, this, str);
  }

  public long CrcBytes(String crcAlg, CkByteData byteData) {
    return chilkatJNI.CkCrypt2_CrcBytes(swigCPtr, this, crcAlg, CkByteData.getCPtr(byteData), byteData);
  }

  public long CrcFile(String crcAlg, String path) {
    return chilkatJNI.CkCrypt2_CrcFile(swigCPtr, this, crcAlg, path);
  }

  public boolean CreateDetachedSignature(String filename, String sigFile) {
    return chilkatJNI.CkCrypt2_CreateDetachedSignature(swigCPtr, this, filename, sigFile);
  }

  public boolean CreateP7M(String inFilename, String p7mPath) {
    return chilkatJNI.CkCrypt2_CreateP7M(swigCPtr, this, inFilename, p7mPath);
  }

  public boolean CreateP7S(String inFilename, String p7sFilename) {
    return chilkatJNI.CkCrypt2_CreateP7S(swigCPtr, this, inFilename, p7sFilename);
  }

  public boolean Decode(String str, String encoding, CkByteData outData) {
    return chilkatJNI.CkCrypt2_Decode(swigCPtr, this, str, encoding, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecodeString(String inStr, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_DecodeString(swigCPtr, this, inStr, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String decodeString(String inStr, String charset, String encoding) {
    return chilkatJNI.CkCrypt2_decodeString(swigCPtr, this, inStr, charset, encoding);
  }

  public boolean DecryptBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_DecryptBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecryptBytesENC(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_DecryptBytesENC(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecryptEncoded(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_DecryptEncoded(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String decryptEncoded(String str) {
    return chilkatJNI.CkCrypt2_decryptEncoded(swigCPtr, this, str);
  }

  public boolean DecryptString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_DecryptString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String decryptString(CkByteData data) {
    return chilkatJNI.CkCrypt2_decryptString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean DecryptStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_DecryptStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String decryptStringENC(String str) {
    return chilkatJNI.CkCrypt2_decryptStringENC(swigCPtr, this, str);
  }

  public boolean Encode(CkByteData data, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_Encode(swigCPtr, this, CkByteData.getCPtr(data), data, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String encode(CkByteData data, String encoding) {
    return chilkatJNI.CkCrypt2_encode(swigCPtr, this, CkByteData.getCPtr(data), data, encoding);
  }

  public boolean EncodeBytes(SWIGTYPE_p_void pByteData, long szByteData, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_EncodeBytes(swigCPtr, this, SWIGTYPE_p_void.getCPtr(pByteData), szByteData, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String encodeBytes(SWIGTYPE_p_void pByteData, long szByteData, String encoding) {
    return chilkatJNI.CkCrypt2_encodeBytes(swigCPtr, this, SWIGTYPE_p_void.getCPtr(pByteData), szByteData, encoding);
  }

  public boolean EncodeString(String inStr, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_EncodeString(swigCPtr, this, inStr, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String encodeString(String inStr, String charset, String encoding) {
    return chilkatJNI.CkCrypt2_encodeString(swigCPtr, this, inStr, charset, encoding);
  }

  public boolean EncryptBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_EncryptBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean EncryptBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_EncryptBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String encryptBytesENC(CkByteData data) {
    return chilkatJNI.CkCrypt2_encryptBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean EncryptEncoded(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_EncryptEncoded(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String encryptEncoded(String str) {
    return chilkatJNI.CkCrypt2_encryptEncoded(swigCPtr, this, str);
  }

  public boolean EncryptString(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_EncryptString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean EncryptStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_EncryptStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String encryptStringENC(String str) {
    return chilkatJNI.CkCrypt2_encryptStringENC(swigCPtr, this, str);
  }

  public boolean GenEncodedSecretKey(String password, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_GenEncodedSecretKey(swigCPtr, this, password, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String genEncodedSecretKey(String password, String encoding) {
    return chilkatJNI.CkCrypt2_genEncodedSecretKey(swigCPtr, this, password, encoding);
  }

  public boolean GenRandomBytesENC(int numBytes, CkString outStr) {
    return chilkatJNI.CkCrypt2_GenRandomBytesENC(swigCPtr, this, numBytes, CkString.getCPtr(outStr), outStr);
  }

  public String genRandomBytesENC(int numBytes) {
    return chilkatJNI.CkCrypt2_genRandomBytesENC(swigCPtr, this, numBytes);
  }

  public boolean GenerateSecretKey(String password, CkByteData outData) {
    return chilkatJNI.CkCrypt2_GenerateSecretKey(swigCPtr, this, password, CkByteData.getCPtr(outData), outData);
  }

  public CkCert GetDecryptCert() {
    long cPtr = chilkatJNI.CkCrypt2_GetDecryptCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetEncodedIV(String encoding, CkString outIV) {
    return chilkatJNI.CkCrypt2_GetEncodedIV(swigCPtr, this, encoding, CkString.getCPtr(outIV), outIV);
  }

  public String getEncodedIV(String encoding) {
    return chilkatJNI.CkCrypt2_getEncodedIV(swigCPtr, this, encoding);
  }

  public String encodedIV(String encoding) {
    return chilkatJNI.CkCrypt2_encodedIV(swigCPtr, this, encoding);
  }

  public boolean GetEncodedKey(String encoding, CkString outKey) {
    return chilkatJNI.CkCrypt2_GetEncodedKey(swigCPtr, this, encoding, CkString.getCPtr(outKey), outKey);
  }

  public String getEncodedKey(String encoding) {
    return chilkatJNI.CkCrypt2_getEncodedKey(swigCPtr, this, encoding);
  }

  public String encodedKey(String encoding) {
    return chilkatJNI.CkCrypt2_encodedKey(swigCPtr, this, encoding);
  }

  public boolean GetEncodedSalt(String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_GetEncodedSalt(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedSalt(String encoding) {
    return chilkatJNI.CkCrypt2_getEncodedSalt(swigCPtr, this, encoding);
  }

  public String encodedSalt(String encoding) {
    return chilkatJNI.CkCrypt2_encodedSalt(swigCPtr, this, encoding);
  }

  public CkCert GetLastCert() {
    long cPtr = chilkatJNI.CkCrypt2_GetLastCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetSignatureSigningTime(int index, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkCrypt2_GetSignatureSigningTime(swigCPtr, this, index, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public boolean GetSignatureSigningTimeStr(int index, CkString outStr) {
    return chilkatJNI.CkCrypt2_GetSignatureSigningTimeStr(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getSignatureSigningTimeStr(int index) {
    return chilkatJNI.CkCrypt2_getSignatureSigningTimeStr(swigCPtr, this, index);
  }

  public String signatureSigningTimeStr(int index) {
    return chilkatJNI.CkCrypt2_signatureSigningTimeStr(swigCPtr, this, index);
  }

  public CkCert GetSignerCert(int index) {
    long cPtr = chilkatJNI.CkCrypt2_GetSignerCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public CkCertChain GetSignerCertChain(int index) {
    long cPtr = chilkatJNI.CkCrypt2_GetSignerCertChain(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCertChain(cPtr, true);
  }

  public boolean HasSignatureSigningTime(int index) {
    return chilkatJNI.CkCrypt2_HasSignatureSigningTime(swigCPtr, this, index);
  }

  public boolean HashBeginBytes(CkByteData data) {
    return chilkatJNI.CkCrypt2_HashBeginBytes(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean HashBeginString(String strData) {
    return chilkatJNI.CkCrypt2_HashBeginString(swigCPtr, this, strData);
  }

  public boolean HashBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_HashBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean HashBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_HashBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String hashBytesENC(CkByteData data) {
    return chilkatJNI.CkCrypt2_hashBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean HashFile(String filename, CkByteData outBytes) {
    return chilkatJNI.CkCrypt2_HashFile(swigCPtr, this, filename, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean HashFileENC(String filename, CkString outStr) {
    return chilkatJNI.CkCrypt2_HashFileENC(swigCPtr, this, filename, CkString.getCPtr(outStr), outStr);
  }

  public String hashFileENC(String filename) {
    return chilkatJNI.CkCrypt2_hashFileENC(swigCPtr, this, filename);
  }

  public boolean HashFinal(CkByteData outBytes) {
    return chilkatJNI.CkCrypt2_HashFinal(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean HashFinalENC(CkString outStr) {
    return chilkatJNI.CkCrypt2_HashFinalENC(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String hashFinalENC() {
    return chilkatJNI.CkCrypt2_hashFinalENC(swigCPtr, this);
  }

  public boolean HashMoreBytes(CkByteData data) {
    return chilkatJNI.CkCrypt2_HashMoreBytes(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean HashMoreString(String strData) {
    return chilkatJNI.CkCrypt2_HashMoreString(swigCPtr, this, strData);
  }

  public boolean HashString(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_HashString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean HashStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_HashStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String hashStringENC(String str) {
    return chilkatJNI.CkCrypt2_hashStringENC(swigCPtr, this, str);
  }

  public boolean HmacBytes(CkByteData inBytes, CkByteData outHmac) {
    return chilkatJNI.CkCrypt2_HmacBytes(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes, CkByteData.getCPtr(outHmac), outHmac);
  }

  public boolean HmacBytesENC(CkByteData inBytes, CkString outEncodedHmac) {
    return chilkatJNI.CkCrypt2_HmacBytesENC(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes, CkString.getCPtr(outEncodedHmac), outEncodedHmac);
  }

  public String hmacBytesENC(CkByteData inBytes) {
    return chilkatJNI.CkCrypt2_hmacBytesENC(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public boolean HmacString(String inText, CkByteData outHmac) {
    return chilkatJNI.CkCrypt2_HmacString(swigCPtr, this, inText, CkByteData.getCPtr(outHmac), outHmac);
  }

  public boolean HmacStringENC(String inText, CkString outEncodedHmac) {
    return chilkatJNI.CkCrypt2_HmacStringENC(swigCPtr, this, inText, CkString.getCPtr(outEncodedHmac), outEncodedHmac);
  }

  public String hmacStringENC(String inText) {
    return chilkatJNI.CkCrypt2_hmacStringENC(swigCPtr, this, inText);
  }

  public boolean InflateBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_InflateBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean InflateBytesENC(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_InflateBytesENC(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean InflateString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_InflateString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String inflateString(CkByteData data) {
    return chilkatJNI.CkCrypt2_inflateString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean InflateStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_InflateStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String inflateStringENC(String str) {
    return chilkatJNI.CkCrypt2_inflateStringENC(swigCPtr, this, str);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkCrypt2_IsUnlocked(swigCPtr, this);
  }

  public boolean MySqlAesDecrypt(String strEncrypted, String strKey, CkString outStr) {
    return chilkatJNI.CkCrypt2_MySqlAesDecrypt(swigCPtr, this, strEncrypted, strKey, CkString.getCPtr(outStr), outStr);
  }

  public String mySqlAesDecrypt(String strEncrypted, String strKey) {
    return chilkatJNI.CkCrypt2_mySqlAesDecrypt(swigCPtr, this, strEncrypted, strKey);
  }

  public boolean MySqlAesEncrypt(String strData, String strKey, CkString outStr) {
    return chilkatJNI.CkCrypt2_MySqlAesEncrypt(swigCPtr, this, strData, strKey, CkString.getCPtr(outStr), outStr);
  }

  public String mySqlAesEncrypt(String strData, String strKey) {
    return chilkatJNI.CkCrypt2_mySqlAesEncrypt(swigCPtr, this, strData, strKey);
  }

  public boolean OpaqueSignBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_OpaqueSignBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean OpaqueSignBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_OpaqueSignBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String opaqueSignBytesENC(CkByteData data) {
    return chilkatJNI.CkCrypt2_opaqueSignBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean OpaqueSignString(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_OpaqueSignString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean OpaqueSignStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_OpaqueSignStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String opaqueSignStringENC(String str) {
    return chilkatJNI.CkCrypt2_opaqueSignStringENC(swigCPtr, this, str);
  }

  public boolean OpaqueVerifyBytes(CkByteData p7s, CkByteData outOriginal) {
    return chilkatJNI.CkCrypt2_OpaqueVerifyBytes(swigCPtr, this, CkByteData.getCPtr(p7s), p7s, CkByteData.getCPtr(outOriginal), outOriginal);
  }

  public boolean OpaqueVerifyBytesENC(String p7s, CkByteData outOriginal) {
    return chilkatJNI.CkCrypt2_OpaqueVerifyBytesENC(swigCPtr, this, p7s, CkByteData.getCPtr(outOriginal), outOriginal);
  }

  public boolean OpaqueVerifyString(CkByteData p7s, CkString outOriginal) {
    return chilkatJNI.CkCrypt2_OpaqueVerifyString(swigCPtr, this, CkByteData.getCPtr(p7s), p7s, CkString.getCPtr(outOriginal), outOriginal);
  }

  public String opaqueVerifyString(CkByteData p7s) {
    return chilkatJNI.CkCrypt2_opaqueVerifyString(swigCPtr, this, CkByteData.getCPtr(p7s), p7s);
  }

  public boolean OpaqueVerifyStringENC(String p7s, CkString outOriginal) {
    return chilkatJNI.CkCrypt2_OpaqueVerifyStringENC(swigCPtr, this, p7s, CkString.getCPtr(outOriginal), outOriginal);
  }

  public String opaqueVerifyStringENC(String p7s) {
    return chilkatJNI.CkCrypt2_opaqueVerifyStringENC(swigCPtr, this, p7s);
  }

  public boolean Pbkdf1(String password, String charset, String hashAlg, String salt, int iterationCount, int outputKeyBitLen, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_Pbkdf1(swigCPtr, this, password, charset, hashAlg, salt, iterationCount, outputKeyBitLen, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String pbkdf1(String password, String charset, String hashAlg, String salt, int iterationCount, int outputKeyBitLen, String encoding) {
    return chilkatJNI.CkCrypt2_pbkdf1(swigCPtr, this, password, charset, hashAlg, salt, iterationCount, outputKeyBitLen, encoding);
  }

  public boolean Pbkdf2(String password, String charset, String hashAlg, String salt, int iterationCount, int outputKeyBitLen, String encoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_Pbkdf2(swigCPtr, this, password, charset, hashAlg, salt, iterationCount, outputKeyBitLen, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String pbkdf2(String password, String charset, String hashAlg, String salt, int iterationCount, int outputKeyBitLen, String encoding) {
    return chilkatJNI.CkCrypt2_pbkdf2(swigCPtr, this, password, charset, hashAlg, salt, iterationCount, outputKeyBitLen, encoding);
  }

  public void RandomizeIV() {
    chilkatJNI.CkCrypt2_RandomizeIV(swigCPtr, this);
  }

  public void RandomizeKey() {
    chilkatJNI.CkCrypt2_RandomizeKey(swigCPtr, this);
  }

  public boolean ReEncode(String data, String fromEncoding, String toEncoding, CkString outStr) {
    return chilkatJNI.CkCrypt2_ReEncode(swigCPtr, this, data, fromEncoding, toEncoding, CkString.getCPtr(outStr), outStr);
  }

  public String reEncode(String data, String fromEncoding, String toEncoding) {
    return chilkatJNI.CkCrypt2_reEncode(swigCPtr, this, data, fromEncoding, toEncoding);
  }

  public boolean ReadFile(String filename, CkByteData outBytes) {
    return chilkatJNI.CkCrypt2_ReadFile(swigCPtr, this, filename, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean SetDecryptCert(CkCert cert) {
    return chilkatJNI.CkCrypt2_SetDecryptCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean SetDecryptCert2(CkCert cert, CkPrivateKey key) {
    return chilkatJNI.CkCrypt2_SetDecryptCert2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(key), key);
  }

  public void SetEncodedIV(String ivStr, String encoding) {
    chilkatJNI.CkCrypt2_SetEncodedIV(swigCPtr, this, ivStr, encoding);
  }

  public void SetEncodedKey(String keyStr, String encoding) {
    chilkatJNI.CkCrypt2_SetEncodedKey(swigCPtr, this, keyStr, encoding);
  }

  public void SetEncodedSalt(String saltStr, String encoding) {
    chilkatJNI.CkCrypt2_SetEncodedSalt(swigCPtr, this, saltStr, encoding);
  }

  public boolean SetEncryptCert(CkCert cert) {
    return chilkatJNI.CkCrypt2_SetEncryptCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public void SetHmacKeyBytes(CkByteData keyBytes) {
    chilkatJNI.CkCrypt2_SetHmacKeyBytes(swigCPtr, this, CkByteData.getCPtr(keyBytes), keyBytes);
  }

  public void SetHmacKeyEncoded(String key, String encoding) {
    chilkatJNI.CkCrypt2_SetHmacKeyEncoded(swigCPtr, this, key, encoding);
  }

  public void SetHmacKeyString(String key) {
    chilkatJNI.CkCrypt2_SetHmacKeyString(swigCPtr, this, key);
  }

  public void SetIV(SWIGTYPE_p_unsigned_char pByteData, long szByteData) {
    chilkatJNI.CkCrypt2_SetIV(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(pByteData), szByteData);
  }

  public void SetSecretKey(SWIGTYPE_p_unsigned_char pByteData, long szByteData) {
    chilkatJNI.CkCrypt2_SetSecretKey(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(pByteData), szByteData);
  }

  public void SetSecretKeyViaPassword(String password) {
    chilkatJNI.CkCrypt2_SetSecretKeyViaPassword(swigCPtr, this, password);
  }

  public boolean SetSigningCert(CkCert cert) {
    return chilkatJNI.CkCrypt2_SetSigningCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean SetSigningCert2(CkCert cert, CkPrivateKey key) {
    return chilkatJNI.CkCrypt2_SetSigningCert2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(key), key);
  }

  public boolean SetVerifyCert(CkCert cert) {
    return chilkatJNI.CkCrypt2_SetVerifyCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean SignBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCrypt2_SignBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public boolean SignBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCrypt2_SignBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String signBytesENC(CkByteData data) {
    return chilkatJNI.CkCrypt2_signBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean SignString(String str, CkByteData outData) {
    return chilkatJNI.CkCrypt2_SignString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public boolean SignStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCrypt2_SignStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String signStringENC(String str) {
    return chilkatJNI.CkCrypt2_signStringENC(swigCPtr, this, str);
  }

  public boolean StringToBytes(String inStr, String charset, CkByteData outBytes) {
    return chilkatJNI.CkCrypt2_StringToBytes(swigCPtr, this, inStr, charset, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean TrimEndingWith(String inStr, String ending, CkString outStr) {
    return chilkatJNI.CkCrypt2_TrimEndingWith(swigCPtr, this, inStr, ending, CkString.getCPtr(outStr), outStr);
  }

  public String trimEndingWith(String inStr, String ending) {
    return chilkatJNI.CkCrypt2_trimEndingWith(swigCPtr, this, inStr, ending);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkCrypt2_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UseCertVault(CkXmlCertVault vault) {
    return chilkatJNI.CkCrypt2_UseCertVault(swigCPtr, this, CkXmlCertVault.getCPtr(vault), vault);
  }

  public boolean VerifyBytes(CkByteData data, CkByteData sig) {
    return chilkatJNI.CkCrypt2_VerifyBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(sig), sig);
  }

  public boolean VerifyBytesENC(CkByteData data, String encodedSig) {
    return chilkatJNI.CkCrypt2_VerifyBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, encodedSig);
  }

  public boolean VerifyDetachedSignature(String filename, String sigFile) {
    return chilkatJNI.CkCrypt2_VerifyDetachedSignature(swigCPtr, this, filename, sigFile);
  }

  public boolean VerifyP7M(String p7mPath, String destPath) {
    return chilkatJNI.CkCrypt2_VerifyP7M(swigCPtr, this, p7mPath, destPath);
  }

  public boolean VerifyP7S(String inFilename, String p7sFilename) {
    return chilkatJNI.CkCrypt2_VerifyP7S(swigCPtr, this, inFilename, p7sFilename);
  }

  public boolean VerifyString(String str, CkByteData sig) {
    return chilkatJNI.CkCrypt2_VerifyString(swigCPtr, this, str, CkByteData.getCPtr(sig), sig);
  }

  public boolean VerifyStringENC(String str, String encodedSig) {
    return chilkatJNI.CkCrypt2_VerifyStringENC(swigCPtr, this, str, encodedSig);
  }

  public boolean WriteFile(String filename, CkByteData fileData) {
    return chilkatJNI.CkCrypt2_WriteFile(swigCPtr, this, filename, CkByteData.getCPtr(fileData), fileData);
  }

  public boolean Pkcs7ExtractDigest(int signerIndex, String pkcs7, CkString outStr) {
    return chilkatJNI.CkCrypt2_Pkcs7ExtractDigest(swigCPtr, this, signerIndex, pkcs7, CkString.getCPtr(outStr), outStr);
  }

  public String pkcs7ExtractDigest(int signerIndex, String pkcs7) {
    return chilkatJNI.CkCrypt2_pkcs7ExtractDigest(swigCPtr, this, signerIndex, pkcs7);
  }

}
