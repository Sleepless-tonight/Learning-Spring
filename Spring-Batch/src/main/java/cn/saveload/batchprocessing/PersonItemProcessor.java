package cn.saveload.batchprocessing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
/**
 * @author shiliang
 * @Classname cn.saveload.batchprocessing
 * @Date 2023/7/6 11:31
 * @Description 2、中间处理器
 * 批处理中的常见范例是摄取数据、转换数据，然后将其通过管道输出到其他地方。在这里，您需要编写一个简单的转换器，将名称转换为大写。
 *
 * PersonItemProcessor 实现 Spring Batch 的 ItemProcessor 接口。这样可以轻松地将代码连接到您将在本指南后面定义的批处理作业中。根据该接口，您收到一个传入 Person 对象，然后将其转换为大写的 Person .
 *
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}
