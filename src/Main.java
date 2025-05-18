import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemInfoDisplay {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String border = "====================================================";
        System.out.println(border);
        System.out.printf("%30s%n", "🌐 SYSTEM INFORMATION 🌐");
        System.out.println(border);
        System.out.printf("%-20s: %s%n", "OS Name", osBean.getName());
        System.out.printf("%-20s: %s%n", "OS Version", osBean.getVersion());
        System.out.printf("%-20s: %s%n", "Architecture", osBean.getArch());
        System.out.println(border);
        System.out.printf("%30s%n", "⏰ CURRENT DATE & TIME ⏰");
        System.out.println(border);
        System.out.printf("%-20s: %s%n", "Date & Time", dtf.format(now));
        System.out.println(border);
    }
}
