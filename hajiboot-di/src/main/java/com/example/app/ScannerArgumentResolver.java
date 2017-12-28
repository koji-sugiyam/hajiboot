package com.example.app;

import java.io.InputStream;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component //componentScanする場合
public class ScannerArgumentResolver implements ArgumentResolver {

	private Scanner scanner;

	@Override
	public Argument resolve(InputStream stream) {
        scanner = new Scanner(stream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return new Argument(a, b);
	}
}
