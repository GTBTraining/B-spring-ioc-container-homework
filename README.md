主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

1@Component是自动装填的，不适用于一些已经编译过的，这个时候就需要@Bean了

2@Component的粒度是类而@Bean可以注解到类中的方法上所以更加灵活

3@Component是通过类路径扫描自动检测并注入到Spring容器中。而@Bean是只能用于在配置类中显式声明单个bean。我要获取这个bean的时候spring按照这种方式去获取这个bean
