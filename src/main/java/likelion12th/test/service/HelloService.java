package likelion12th.test.service;


import likelion12th.test.domain.Hello;
import likelion12th.test.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class HelloService {

    private final HelloRepository helloRepository;

    public Hello addHello(String name) {
        Hello hello = new Hello(name);
        return helloRepository.addHello(hello);
    }

    public Hello getHello(Long id) {
        return helloRepository.getHello(id);
    }
}
