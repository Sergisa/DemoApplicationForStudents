package com.company;

import org.apache.commons.cli.*;

public class Main {
    static CommandLine cmd;
    public static void main(String[] args) {
        Options options = new Options();

        Option lookupPacketType = new Option("p", "packet", true, "Packet type to scan for");
        lookupPacketType.setRequired(false);
        options.addOption(lookupPacketType);

        Option inputFile = new Option("f", "file", true, "input file path");
        inputFile.setRequired(false);
        options.addOption(inputFile);

        Option sourceIP = new Option("i", "ip", true, "Ip address of client computer");
        sourceIP.setRequired(false);
        options.addOption(sourceIP);

        Option DNS = new Option("d", "dns", false, "Retrieve DNS Address of IP");
        DNS.setRequired(false);
        options.addOption(DNS);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();


        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println("парсинг параметров не удался");
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);
            System.exit(1);
        }
        System.out.println(cmd.hasOption('f'));
        System.out.println(cmd.getOptionValue('f'));

    }
}
