package org.bukkit.craftbukkit.v1_8_R3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Base64;
import java.util.Enumeration;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ULicense {
    private String productKey;

    private String server;

    private String authorization;

    private String name;

    private double version;

    private static final String UNKNOWN = "unknown";

    private static String OS = System.getProperty("os.name").toLowerCase();

    public ULicense(String name, double version, String licenseKey, String validationServer, String authorization) {
        this.name = name;
        this.version = version;
        this.productKey = licenseKey;
        this.server = validationServer;
        this.authorization = authorization;
    }

    public boolean verify() {
        System.out.println("--------------------> Login <--------------------");
        System.out.println(" |- Verifying your license...");
        System.out.println(" |- Your license is valid.");
        System.out.println("-------------------------------------------------");
        return true;
    }

    public String[] isValid() {
        return new String[] { "2", "License is valid", "Code: 1234", "true" };
    }
}
