/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprcnl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprgnl;
import com.spire.presentation.packages.sprhhg;
import com.spire.presentation.packages.sprljm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvl;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spryul;
import com.spire.presentation.packages.sprzen;
import com.spire.presentation.pdf.security.PdfSecurity;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;

public class sprsak {
    public static char[] cfr_renamed_4;

    public static Certificate cfr_renamed_9496(PublicKey arg0, PrivateKey arg1) throws Exception {
        X509Certificate x509Certificate;
        String string = PdfSecurity.cfr_renamed_9("$J&\"KW(J3\u001f\u0002W+\u0012\u0000\u001e\b\u0019G\u0018\u0001W\u0013\u001f\u0002W%\u0018\u0012\u0019\u0004\u000eG4\u0006\u0004\u0013\u001b\u0002[G82J%\u0018\u0012\u0019\u0004\u000eG'\u0015\u001e\n\u0016\u0015\u000eG4\u0002\u0005\u0013\u001e\u0001\u001e\u0004\u0016\u0013\u0012");
        String string2 = sprabl.cfr_renamed_9("\u001f\u0016\u001d~p\u000b\u0013\u0016\bC9\u000b\u0010N;B3E|D:\u000b(C9\u000b\u001eD)E?R|h=X(G9\u0007|d\t\u0016\u001eD)E?R|{.B1J.R|h9Y(B:B?J(N");
        sprcnl sprcnl2 = new sprcnl(new sprnbm(string), BigInteger.valueOf(1L), new Date(System.currentTimeMillis() - 2592000000L), new Date(System.currentTimeMillis() + 2592000000L), new sprnbm(string2), arg0);
        sprtpl sprtpl2 = sprcnl2.cfr_renamed_7373(new sprhhg(PdfSecurity.cfr_renamed_9("$/6V \u000e\u0003\u000f%46")).cfr_renamed_1499("BC").cfr_renamed_1568(arg1));
        X509Certificate x509Certificate2 = x509Certificate = new spryul().cfr_renamed_1499("BC").cfr_renamed_7519(sprtpl2);
        x509Certificate2.checkValidity(new Date());
        x509Certificate2.verify(arg0);
        ((sprof)((Object)x509Certificate2)).cfr_renamed_9065(sprdl.cfr_renamed_470, new sprzen(sprabl.cfr_renamed_9("\u001eD)E?R|{.B1J.R|h9Y(B:B?J(N")));
        return x509Certificate;
    }

    static {
        char[] cArray = new char[11];
        cArray[0] = 104;
        cArray[1] = 101;
        cArray[2] = 108;
        cArray[3] = 108;
        cArray[4] = 111;
        cArray[5] = 32;
        cArray[6] = 119;
        cArray[7] = 111;
        cArray[8] = 114;
        cArray[9] = 108;
        cArray[10] = 100;
        cfr_renamed_4 = cArray;
    }

    public static Certificate cfr_renamed_9497(PublicKey arg0, PrivateKey arg1, X509Certificate arg2) throws Exception {
        X509Certificate x509Certificate;
        sprljm sprljm2 = new sprljm();
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_957, PdfSecurity.cfr_renamed_9("&\""));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_728, sprabl.cfr_renamed_9("\u007f4N|g9L5D2\u000b3M|_4N|i3^2H%\u000b\u001fJ/_0N"));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_112, PdfSecurity.cfr_renamed_9("5\b\u0002\t\u0014\u001eW.\u0019\u0013\u0012\u0015\u001a\u0002\u0013\u000e\u0016\u0013\u0012G4\u0002\u0005\u0013\u001e\u0001\u001e\u0004\u0016\u0013\u0012"));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_951, sprabl.cfr_renamed_9(":N9O>J?@qH.R,_3k>D)E?R?J/_0NrD.L"));
        sprgnl sprgnl2 = new sprgnl(arg2, BigInteger.valueOf(2L), new Date(System.currentTimeMillis() - 2592000000L), new Date(System.currentTimeMillis() + 2592000000L), sprljm2.cfr_renamed_1451(), arg0);
        sprrvl sprrvl2 = new sprrvl();
        sprgnl2.cfr_renamed_4998(sprrdm.cfr_renamed_126, false, sprrvl2.cfr_renamed_9499(arg0));
        sprgnl2.cfr_renamed_4998(sprrdm.cfr_renamed_105, false, sprrvl2.cfr_renamed_9500(arg2));
        sprgnl2.cfr_renamed_4998(sprrdm.cfr_renamed_133, true, new sprbcm(0));
        sprtpl sprtpl2 = sprgnl2.cfr_renamed_7373(new sprhhg(PdfSecurity.cfr_renamed_9("$/6V \u000e\u0003\u000f%46")).cfr_renamed_1499("BC").cfr_renamed_1568(arg1));
        X509Certificate x509Certificate2 = x509Certificate = new spryul().cfr_renamed_1499("BC").cfr_renamed_7519(sprtpl2);
        x509Certificate2.checkValidity(new Date());
        x509Certificate2.verify(arg2.getPublicKey());
        ((sprof)((Object)x509Certificate)).cfr_renamed_9065(sprdl.cfr_renamed_470, new sprzen(sprabl.cfr_renamed_9("i3^2H%\u000b\u0015E(N.F9O5J(N|h9Y(B:B?J(N")));
        return x509Certificate;
    }

    public static void main(String[] arg0) throws Exception {
        KeyStore keyStore;
        Security.addProvider(new sprsci());
        RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("\u0005C\u0006@\u0002CQFPGR@S\u0011VA\u0006NPG_E\u0005EU\u0015\u0002B_\u0015Q\u0016U\u0016QE^@^OSF^\u0015\u0002FUOPE\u0006C\u0005\u0013\u0005\u0016QEQ\u0014\u0001\u0016\u0002N^GW\u0011PA\u0006\u0015\u0001\u0015VEVD^\u0013\u0004\u0012R\u0013\u0002BQBQC\u0001\u0016\u0005E\u0005ARCTFQB\u0006GSG\u0004AWA_OPCUG\u0002DT\u0013^F\u0002\u0013P\u0012\u0003@"), 16), new BigInteger(sprabl.cfr_renamed_9("m\u001a"), 16));
        RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("\u0005C\u0006@\u0002CQFPGR@S\u0011VA\u0006NPG_E\u0005EU\u0015\u0002B_\u0015Q\u0016U\u0016QE^@^OSF^\u0015\u0002FUOPE\u0006C\u0005\u0013\u0005\u0016QEQ\u0014\u0001\u0016\u0002N^GW\u0011PA\u0006\u0015\u0001\u0015VEVD^\u0013\u0004\u0012R\u0013\u0002BQBQC\u0001\u0016\u0005E\u0005ARCTFQB\u0006GSG\u0004AWA_OPCUG\u0002DT\u0013^F\u0002\u0013P\u0012\u0003@"), 16), new BigInteger(sprabl.cfr_renamed_9("m\u001a"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("^\u0011QA\u0001A\u0005GRCVG\u0004\u0013RGT\u0015U@WN\u0002O_FVB\u0003BR\u0013\u0006\u0014\u0002\u0013^C\u0003F\u0006DS\u0013S\u0012TE\u0005\u0011_ES\u0013W\u0013\u0003\u0012QGUO\u0006\u0012PN\u0004B\u0001GP\u0015ROW\u0011R\u0013\u0004\u0012UCW\u0013PFVF\u0001@\u0003\u0013\u0005FTG\u0006@^CR\u0014\u0003@\u0003NR@\u0003F^EWN^C\u0003\u0016TO^\u0011SNW\u0014_N"), 16), new BigInteger(sprabl.cfr_renamed_9("?\u001b=\u001bk\u001edH8Mm\u001fn\u001ejMk\u00138\u001fk\u001bdHd\u001d>N?O9J8\u001a>\u001elJ8\u001f=OjHiHk\u001boNn\u001aj\u0013:I:\u0018k\u0013d\u001f?I"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("\u0001GV@TC\u0003@^AW\u0012\u0006AWGPG\u0001F\u0005GQ\u0011U\u0015\u0005OV\u0015\u0001\u0016\u0004C_\u0011\u0001F^E\u0006\u0012VOSBV\u0013R\u0012RA\u0004@TC\u0006B\u0006\u0016\u0005O\u0006B"), 16), new BigInteger(sprabl.cfr_renamed_9(">\u001ehI>\u00129O:Mn\u0019l\u001emOeN9\u001dlMe\u0018i\u001a=\u001fd\u001ee\u001a>\u001di\u001blJo\u001ae\u001fn\u0012?\u001bj\u0012=\u00189\u0018o\u001e=\u001a8\u001dm\u001cm\u0018e\u001a"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("\u0003D\u0003OT\u0013\u0006\u0011U\u0016W\u0014\u0002\u0014\u0003DTAP\u0016\u0002A\u0001O\u0006\u0012V\u0016\u0002\u0015_E\u0002N\u0006\u0014U\u0011_FQ\u0014Q\u0011\u0004C_DRDT\u0013_E^@\u0003\u0013PO_C\u0004\u0013"), 16), new BigInteger(sprabl.cfr_renamed_9(">\u0013:\u001enM?\u001d:\u0018d\u001ee\u00188J>Ij\u001dmOoMi\u001b:\u0013d\u0012kMd\u001al\u001d9N9\u001ddImI?Nk\u0013=\u0012iIm\u0018nIhNiIiOm\u0012"), 16));
        RSAPublicKeySpec rSAPublicKeySpec2 = new RSAPublicKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("_\u0013\u0002G\u0003FVD\u0004B\u0002@TA^A^\u0014_\u0013U\u0015WCP\u0016UCT\u0011_\u0011\u0002F_\u0012\u0003\u0016\u0003AS\u0014\u0003\u0012^\u0012_CU\u0013TAQNUDW\u0014\u0006C_A\u0001@\u0004\u0011\u0003\u0013\u0002F\u0001O\u0002\u0012\u0004BS\u0013VNWB\u0001\u0011\u0001GS\u0016\u0004\u0014_B\u0002AVG^D\u0002F_G\u0004\u0016\u0003\u0014Q\u0014\u0002\u0016SGP\u0011VNT\u0013SC\u0005\u0015W\u0012^CSN\u0005O\u0003\u0015\u0005C^@_C\u0004\u0013^\u0012TAUAW\u0014TN\u0002GQ\u0016^CPE^N^@_\u0014Q\u0012\u0003OTGW@UC\u0002O_@VN_\u0014\u0001\u0012\u0003\u0012UG\u0001D\u0001\u0015\u0003\u0012QB_\u0011\u0006E\u0005\u0013W@_\u0015\u0002NSA\u0006D^E\u0005\u0013TC^\u0011U\u0015SN\u0004C_A\u0002EW\u0014SGRB_O\u0002DWAPGQ\u0014^GV@TG_\u0012QN"), 16), new BigInteger(sprabl.cfr_renamed_9(":M:M"), 16));
        RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec2 = new RSAPrivateCrtKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("_\u0013\u0002G\u0003FVD\u0004B\u0002@TA^A^\u0014_\u0013U\u0015WCP\u0016UCT\u0011_\u0011\u0002F_\u0012\u0003\u0016\u0003AS\u0014\u0003\u0012^\u0012_CU\u0013TAQNUDW\u0014\u0006C_A\u0001@\u0004\u0011\u0003\u0013\u0002F\u0001O\u0002\u0012\u0004BS\u0013VNWB\u0001\u0011\u0001GS\u0016\u0004\u0014_B\u0002AVG^D\u0002F_G\u0004\u0016\u0003\u0014Q\u0014\u0002\u0016SGP\u0011VNT\u0013SC\u0005\u0015W\u0012^CSN\u0005O\u0003\u0015\u0005C^@_C\u0004\u0013^\u0012TAUAW\u0014TN\u0002GQ\u0016^CPE^N^@_\u0014Q\u0012\u0003OTGW@UC\u0002O_@VN_\u0014\u0001\u0012\u0003\u0012UG\u0001D\u0001\u0015\u0003\u0012QB_\u0011\u0006E\u0005\u0013W@_\u0015\u0002NSA\u0006D^E\u0005\u0013TC^\u0011U\u0015SN\u0004C_A\u0002EW\u0014SGRB_O\u0002DWAPGQ\u0014^GV@TG_\u0012QN"), 16), new BigInteger(sprabl.cfr_renamed_9(":M:M"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("P\u0013\u0002\u0015V\u0015VNS\u0016_B\u0005\u0014\u0001\u0013UN\u0004\u0011_@VCVFSA_\u0016\u0003\u0015\u0004N_@QBWNWD\u0002D\u0005\u0016\u0004\u0014_DTO\u0004CSN\u0004\u0016P\u0015TE\u0002\u0011\u0003D^\u0011\u0001\u0014TD\u0005\u0014_CSFU\u0011\u0004\u0013P\u0013\u0001F_\u0013UD\u0004\u0012^\u0013P\u0014UB\u0002\u0016^FW\u0015V\u0016\u0002N^ORDPD\u0002GU@T\u0015S\u0013\u0004\u0016P\u0011U\u0012W\u0013\u0005D\u0005@TFSGRA\u0006\u0014Q@\u0001\u0013U@P\u0011_\u0011_N\u0004\u0011U\u0011\u0003@T\u0014TC\u0004A\u0004\u0016QN\u0001N\u0005\u0016S@PFSD\u0003E\u0005G\u0002ESCRBSO\u0006\u0016W\u0015S\u0016_CPDWNRF_EQDV\u0013\u0006CQOSC\u0004DRA\u0001B\u0002B\u0004@REU\u0012\u0005BS\u0015R\u0016TD\u0001FV\u0013PDW\u0012\u0006\u0013^\u0014W\u0014\u0001\u0011"), 16), new BigInteger(sprabl.cfr_renamed_9("9MhH9O9\u001ek\u0018?N=\u001fkMd\u0018j\u0012eId\u001ahO9\u001fo\u001bnN8Ij\u001b9N:Nh\u0019jHi\u00199\u001akI8\u001cd\u001clN?\u001c?\u001d>\u001c=\u0019hM9\u001ei\u0019d\u00199I>\u001co\u001ck\u001e:\u0018j\u0012m\u001ek\u001cn\u001d:H:Ie\u0013dO9MnIh\u001bo\u001elI8H=\u00129\u001e>\u001fm\u0013o\u001fl\u0019d\u0013:\u001dh\u0012"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("^@\u0004@PDP\u0013V\u0015^\u0016WG_O\u0004D\u0004@\u0005BUORD^ES@\u0001\u0013U\u0016VB^D\u0002@\u0002GV\u0014\u0002\u0011VO_C_@RB\u0005\u0012_E\u0001C\u0006CR\u0016\u0006G^DU@Q\u0014\u0005G\u0004\u0015\u0001FVO\u0004\u0015SFVFPBSG\u0006@_\u0011T\u0011\u0004CPF\u0005\u0016R\u0013QN\u0001GWCUEPC\u0003\u0012\u0001\u0014^FQFUAR@UF"), 16), new BigInteger(sprabl.cfr_renamed_9("jHj\u001fm\u001be\u001f9\u0019hOm\u001cn\u001cn\u0013>\u00138JoHn\u001ck\u001c9\u001deJ8M8\u001bd\u0018e\u001bd\u001e>NkNo\u0013?\u001c?\u001f=\u00198Ol\u001b>\u001a=Ne\u001deMnN?\u00128\u0019oNkNo\u001cl\u0012lM?Oh\u001feJh\u001b=MlN8\u001fj\u0018:NmHj\u001anOj\u0013m\u001b8\u001d>\u001f:\u001edIkI:Jo\u001a9IiM"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("PG\u0005@VET\u0012_\u0012QN\u0003\u0011\u0006@Q\u0011\u0002\u0015VETA\u0003G\u0006A_AVCS\u0015WG\u0002NUDU\u0012\u0003BU\u0015PD_CP\u0012PC\u0002\u0011T\u0016\u0001@V\u0011\u0005CR\u0014\u0004\u0015UCUAV\u0011SG\u0003EP\u0011^OVGV\u0012UDW\u0014\u0001EP\u0015^@P\u0016R\u0013R\u0011V\u0011VB\u0001A\u0004\u0011SO\u0003B\u0004\u0015V\u0013\u0006E\u0006D\u0006D\u0005OP\u0011"), 16), new BigInteger(sprabl.cfr_renamed_9("9\u0018dMi\u001ci\u001b8\u0012kNn\u001cl\u0012e\u001d=\u0019d\u001d8MnNj\u001eoM8\u0019jHn\u001fn\u001al\u001dh\u0018jMiI=IlMhHkJeNj\u001ehH9\u001bn\u001dj\u001e8\u001e=\u0019d\u001a:\u0019?\u001fm\u0019h\u001ejMnOmM=\u0019j\u001ed\u001d9Ml\u001f=\u0012=O=He\u001bl\u001f?JkMe\u001ao\u001aj\u0019?In\u00139\u001aoI:\u001flO"), 16));
        RSAPublicKeySpec rSAPublicKeySpec3 = new RSAPublicKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("\u0005ERN\u0003E\u0003A\u0002AU@\u0006@QO\u0004NS\u0015\u0002DQFQC\u0004E\u0003N\u0001\u0014PN\u0003NP\u0016\u0006\u0015^ERDVCW\u0012R\u0015\u0001FP@RFVNP@TF\u0003A\u0001@RCW\u0013UBWN\u0002@\u0005N\u0001\u0011\u0002\u0012W\u0016PG\u0006A\u0002EQ\u0013RA\u0002NU\u0013U\u0012\u0003\u0013P\u0011_B\u0006\u0015\u0006ORAWG\u0005A^G_N\u0001DR\u0011Q\u0015\u0003\u0015\u0001D\u0004E^O\u0002GROSERDR\u0013^\u0011WAS\u0012Q\u0015WD^F\u0004\u0015P\u0013TGQ\u0012W\u0016U\u0013UG\u0004C\u0003\u0011\u0005C\u0002@\u0005C^\u0016^ASG\u0005\u0013\u0002\u0016UA\u0004FW\u0016\u0003A^\u0014T\u0011WBWGP\u0014\u0002ERFT\u0014\u0002\u0012SC\u0004\u0011\u0002GVN^O\u0002AU\u0015Q\u0014TAT@\u0003D\u0001\u0014WD^FW@^\u0015UA\u0002\u0012TA\u0003B"), 16), new BigInteger(sprabl.cfr_renamed_9("m\u001a"), 16));
        RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec3 = new RSAPrivateCrtKeySpec(new BigInteger(PdfSecurity.cfr_renamed_9("\u0005ERN\u0003E\u0003A\u0002AU@\u0006@QO\u0004NS\u0015\u0002DQFQC\u0004E\u0003N\u0001\u0014PN\u0003NP\u0016\u0006\u0015^ERDVCW\u0012R\u0015\u0001FP@RFVNP@TF\u0003A\u0001@RCW\u0013UBWN\u0002@\u0005N\u0001\u0011\u0002\u0012W\u0016PG\u0006A\u0002EQ\u0013RA\u0002NU\u0013U\u0012\u0003\u0013P\u0011_B\u0006\u0015\u0006ORAWG\u0005A^G_N\u0001DR\u0011Q\u0015\u0003\u0015\u0001D\u0004E^O\u0002GROSERDR\u0013^\u0011WAS\u0012Q\u0015WD^F\u0004\u0015P\u0013TGQ\u0012W\u0016U\u0013UG\u0004C\u0003\u0011\u0005C\u0002@\u0005C^\u0016^ASG\u0005\u0013\u0002\u0016UA\u0004FW\u0016\u0003A^\u0014T\u0011WBWGP\u0014\u0002ERFT\u0014\u0002\u0012SC\u0004\u0011\u0002GVN^O\u0002AU\u0015Q\u0014TAT@\u0003D\u0001\u0014WD^FW@^\u0015UA\u0002\u0012TA\u0003B"), 16), new BigInteger(sprabl.cfr_renamed_9("m\u001a"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("^E\u0002G_\u0011_D\u0004\u0014^NUGPCQN_N\u0004\u0016RGTC\u0003\u0014\u0005D_C\u0006G^C\u0001\u0015^\u0014R\u0016QE_O\u0001\u0014\u0004CTGSCUC\u0006\u0015_\u0011RATO_\u0011PEQBU\u0013_\u0011\u0006\u0011\u0004AR\u0016S\u0015^GUG_NQ\u0011U\u0014\u0003\u0012UNPG_G\u0001E\u0006BSG\u0002@\u0005@\u0004\u0012R\u0016\u0001G\u0005DSCQ\u0012VERO\u0003F\u0003\u0013P\u0011UCR\u0014\u0001BSFUC\u0005C\u0004A\u0002FP\u0013\u0006EV\u0015^G\u0006G\u0002\u0015\u0003EUAWB\u0002A\u0001CR\u0014^\u0011VDQ\u0013P\u0016VD\u0002\u0016\u0006\u0014V\u0014W\u0011PC_@\u0003\u0012_\u0015\u0003A\u0003NUC^@UCWO\u0002\u0015\u0005B_\u0016\u0001@V\u0012PA\u0001\u0013P\u0015WFU\u0016_\u0013W\u0012VAR\u0011T\u0016\u0002E\u0002BW@P\u0016_ASO\u0002AVN"), 16), new BigInteger(sprabl.cfr_renamed_9(":\u001ciNd\u001bd\u0018eIeIe\u0018k\u0012:\u001a?Mm\u001an\u0013:\u0018n\u001aj\u0018e\u001ci\u001c8I=\u001em\u001fj\u001fnHn\u001bjI>I8\u0012eMeJh\u0013h\u001dn\u001bdIoNe\u0018:I>NiNl\u001en\u001c?Hi\u0012>\u001a8\u001f>\u0012n\u00128\u0012i\u001ei\u0013i\u0018l\u001bhHkHdIo\u001b9NjJn\u001aoHoOmI>\u001ch\u001aiOl\u0018"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("\u0005O^E\u0003N\u0002\u0015\u0003\u0015\u0001\u0014T@\u0002D^@UBQ\u0013\u0003O\u0006B\u0003DVETBTC\u0003F\u0001GT@UAUOS@SD\u0003\u0013\u0004A\u0005\u0012T\u0016PG^\u0012\u0003\u0015QNQ\u0011\u0004CW\u0014P\u0013^GU\u0012\u0003OWC\u0004A\u0002\u0012\u0002@TG\u0002\u0012\u0002D\u0003B\u0005EW\u0015\u0001A\u0005\u0013_\u0013_@\u0006E^A_FT\u0014_@\u0003D\u0005D\u0004\u0014^\u0013PNS@"), 16), new BigInteger(sprabl.cfr_renamed_9("mOmJnOoH=\u00139\u001en\u001bj\u0013>\u0018l\u0012hOi\u001bmHeJd\u001fnM9Ho\u001c:\u001ehO>\u001ajNeJj\u001cl\u001clJdIoMi\u0018?Hl\u00188\u001fn\u001ekJ8\u0019i\u0019=\u001a=\u001dh\u001b9J8Oj\u001bo\u001cn\u001f8\u001c>Mo\u001co\u001ce\u001ahIi\u001fhJ9\u0018o\u00199N8MhMo\u001fh\u0018jH=Hn\u001e?N>\u001e"), 16), new BigInteger(PdfSecurity.cfr_renamed_9("Q\u0014^E^\u0012S\u0012_FQ@U\u0011\u0002\u0011SN\u0003N\u0004OUBVAT\u0011\u0002\u0014^@\u0004C\u0005@\u0005\u0016P\u0016\u0004\u0015UA\u0004G_ESATO\u0006\u0014UEQGR\u0013PEWF\u0004NSAUBP@WN_C\u0001@_\u0016RA\u0002A\u0002ERNWC\u0001\u0012P\u0013\u0005CW@WN^\u0014\u0006\u0013^\u0015VCRO_OSF\u0005NS\u0011R\u0016\u0005C^O\u0003\u0013\u0002\u0013"), 16), new BigInteger(sprabl.cfr_renamed_9("8J9\u001cj\u001emN9\u001deJ8\u001a8\u001bd\u001a9HiNk\u001ad\u0013=Nm\u0019jMj\u001bl\u001f:Mo\u0012i\u001ejI8Ne\u001b9\u001b>\u0013k\u001be\u001dnM=\u001c>\u0012n\u001d8\u001bk\u001bj\u0013jOd\u0019h\u001f:NiJeJ=\u001cl\u0012=\u0012i\u001dd\u001d=\u001al\u001fj\u001ah\u0013o\u001f>\u001b=O=\u001f>\u001alMi\u0018m\u0012kJiH>\u001f?\u0012k\u0018o\u0012"), 16));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", "BC");
        PrivateKey privateKey = keyFactory.generatePrivate(rSAPrivateCrtKeySpec3);
        PublicKey publicKey = keyFactory.generatePublic(rSAPublicKeySpec3);
        PrivateKey privateKey2 = keyFactory.generatePrivate(rSAPrivateCrtKeySpec2);
        PublicKey publicKey2 = keyFactory.generatePublic(rSAPublicKeySpec2);
        PrivateKey privateKey3 = keyFactory.generatePrivate(rSAPrivateCrtKeySpec);
        PublicKey publicKey3 = keyFactory.generatePublic(rSAPublicKeySpec);
        Certificate[] certificateArray = new Certificate[3];
        certificateArray[2] = sprsak.cfr_renamed_9496(publicKey, privateKey);
        certificateArray[1] = sprsak.cfr_renamed_9497(publicKey2, privateKey, (X509Certificate)certificateArray[2]);
        certificateArray[0] = sprsak.cfr_renamed_9501(publicKey3, privateKey2, publicKey2);
        sprof sprof2 = (sprof)((Object)privateKey3);
        sprrvl sprrvl2 = new sprrvl();
        sprof sprof3 = sprof2;
        sprof3.cfr_renamed_9065(sprdl.cfr_renamed_470, new sprzen(PdfSecurity.cfr_renamed_9("\"\u0005\u000e\u0014@\u0004G<\u0002\u000e")));
        sprof3.cfr_renamed_9065(sprdl.cfr_renamed_91, sprrvl2.cfr_renamed_9499(publicKey3));
        KeyStore keyStore2 = keyStore = KeyStore.getInstance(sprabl.cfr_renamed_9("\f`\u001fxm\u0019"), "BC");
        keyStore2.load(null, null);
        keyStore2.setKeyEntry(PdfSecurity.cfr_renamed_9("\"\u0005\u000e\u0014@\u0004G<\u0002\u000e"), privateKey3, null, certificateArray);
        FileOutputStream fileOutputStream = new FileOutputStream(sprabl.cfr_renamed_9("5Or[m\u0019"));
        keyStore2.store(fileOutputStream, cfr_renamed_4);
        fileOutputStream.close();
    }

    public static Certificate cfr_renamed_9501(PublicKey arg0, PrivateKey arg1, PublicKey arg2) throws Exception {
        sprof sprof2;
        X509Certificate x509Certificate;
        sprljm sprljm2 = new sprljm();
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_957, PdfSecurity.cfr_renamed_9("&\""));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_728, sprabl.cfr_renamed_9("\u007f4N|g9L5D2\u000b3M|_4N|i3^2H%\u000b\u001fJ/_0N"));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_112, PdfSecurity.cfr_renamed_9("5\b\u0002\t\u0014\u001eW.\u0019\u0013\u0012\u0015\u001a\u0002\u0013\u000e\u0016\u0013\u0012G4\u0002\u0005\u0013\u001e\u0001\u001e\u0004\u0016\u0013\u0012"));
        sprljm2.cfr_renamed_9498(sprebm.cfr_renamed_951, sprabl.cfr_renamed_9(":N9O>J?@qH.R,_3k>D)E?R?J/_0NrD.L"));
        sprljm sprljm3 = new sprljm();
        sprljm3.cfr_renamed_9498(sprebm.cfr_renamed_957, PdfSecurity.cfr_renamed_9("&\""));
        sprljm3.cfr_renamed_9498(sprebm.cfr_renamed_728, sprabl.cfr_renamed_9("\u007f4N|g9L5D2\u000b3M|_4N|i3^2H%\u000b\u001fJ/_0N"));
        sprljm3.cfr_renamed_9498(sprebm.cfr_renamed_79, PdfSecurity.cfr_renamed_9(":\u0002\u001b\u0005\u0018\u0012\u0005\t\u0012"));
        sprljm3.cfr_renamed_9498(sprebm.cfr_renamed_82, sprabl.cfr_renamed_9("n.B?\u000b\u0014\u0005|n?C5O2J"));
        sprljm3.cfr_renamed_9498(sprebm.cfr_renamed_951, PdfSecurity.cfr_renamed_9("\u0001\u0012\u0002\u0013\u0005\u0016\u0004\u001cJ\u0014\u0015\u000e\u0017\u0003\b7\u0005\u0018\u0012\u0019\u0004\u000e\u0004\u0016\u0014\u0003\u000b\u0012I\u0018\u0015\u0010"));
        sprgnl sprgnl2 = new sprgnl(sprljm2.cfr_renamed_1451(), BigInteger.valueOf(3L), new Date(System.currentTimeMillis() - 2592000000L), new Date(System.currentTimeMillis() + 2592000000L), sprljm3.cfr_renamed_1451(), arg0);
        sprrvl sprrvl2 = new sprrvl();
        sprgnl2.cfr_renamed_4998(sprrdm.cfr_renamed_126, false, sprrvl2.cfr_renamed_9499(arg0));
        sprgnl2.cfr_renamed_4998(sprrdm.cfr_renamed_105, false, sprrvl2.cfr_renamed_9502(arg2));
        sprtpl sprtpl2 = sprgnl2.cfr_renamed_7373(new sprhhg(sprabl.cfr_renamed_9("x\u0014jm|5_4y\u000fj")).cfr_renamed_1499("BC").cfr_renamed_1568(arg1));
        X509Certificate x509Certificate2 = x509Certificate = new spryul().cfr_renamed_1499("BC").cfr_renamed_7519(sprtpl2);
        x509Certificate2.checkValidity(new Date());
        x509Certificate2.verify(arg2);
        sprof sprof3 = sprof2 = (sprof)((Object)x509Certificate);
        sprof3.cfr_renamed_9065(sprdl.cfr_renamed_470, new sprzen(PdfSecurity.cfr_renamed_9("\"\u0005\u000e\u0014@\u0004G<\u0002\u000e")));
        sprof3.cfr_renamed_9065(sprdl.cfr_renamed_91, sprrvl2.cfr_renamed_9499(arg0));
        return x509Certificate;
    }
}

